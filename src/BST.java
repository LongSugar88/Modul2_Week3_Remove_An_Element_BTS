public class BST<T extends Comparable<T>>  {
    Node<T> root;
    int size;
    BST(){

    }
    public boolean insert( T element) {
        Node<T> parent = null;
        Node<T> current = root;
        if (root == null) {
            root = new Node<>(element);
        } else {
            while (current != null) {
                if (current.data.compareTo(element) < 0) {
                    parent = current;
                    current = current.right;
                }
                else if (current.data.compareTo(element) > 0) {
                    parent = current;
                    current = current.left;
                } else
                    return false;
            }
            if (element.compareTo(parent.data) < 0) {
                parent.left = new Node<>(element);
            } else {
                parent.right = new Node<>(element);
            }
        }
        return true;
    }
    public Node<T> findMax(Node<T> root){
        while (root.right != null){
            root = root.right;
        }
        return root;
    }
    public Node<T> remove(T element){
        root = remove(root, element);
        size--;
        return root;
    }
    private Node<T> remove(Node<T> root, T element){
        if (root==null){
            return root;
        } else {
            if (element.compareTo(root.data)>0){
                root.right= remove(root.right,element);
            } else if (element.compareTo(root.data)<0){
                root.left=remove(root.left,element);
            } else {
                if (root.left==null){
                    return root.right;
                } else if (root.right==null){
                    String data = root.left.data.toString();
                    return root.left;
                } else {
                    root.data =findMax(root.left).data;
                    String data = root.data.toString();
                    root.left=remove(root.left,root.data);
                }
            }
        }
        String data = root.data.toString();
        return root;
    }

    public void inorder(){
        inorder(root);
    }
    private void inorder(Node<T> root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }
}