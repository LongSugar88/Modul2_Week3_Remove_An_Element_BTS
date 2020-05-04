public class test {
    public static void main(String[] args) throws Exception {
        BST<Integer> myList = new BST<>();
        myList.insert(60);
        myList.insert(55);
        myList.insert(100);
        myList.insert(45);
        myList.insert(57);
        myList.insert(67);
        myList.insert(107);
        myList.inorder();
        System.out.println("--------------------------------");
        System.out.println(myList.size);
        System.out.println("--------------------------------");
//        myList.remove(5);
        myList.remove(60);
        myList.inorder();
        System.out.println("--------------------------------");
        System.out.println(myList.size);
    }
}
