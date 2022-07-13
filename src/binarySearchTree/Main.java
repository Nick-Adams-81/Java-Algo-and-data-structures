package binarySearchTree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(10);
        myBST.insert(5);
        myBST.insert(15);
        System.out.println(myBST.contains(10));
    }
}
