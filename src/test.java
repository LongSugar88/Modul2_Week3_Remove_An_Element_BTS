public class test {
    public static void main(String[] args) throws Exception {
        BST<Integer> myList = new BST<Integer>();
        myList.insert(5);
        myList.insert(2);
        myList.insert(7);
        myList.insert(1);
        myList.insert(8);
        myList.inorder();
        System.out.println("--------------------------------");
        System.out.println(myList.size);
        System.out.println("--------------------------------");
        myList.remove(5);
        myList.remove(2);
        myList.inorder();
        System.out.println("--------------------------------");
        System.out.println(myList.size);
    }
}
