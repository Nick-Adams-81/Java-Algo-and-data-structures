package binarySearchTree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(100);
        myBST.insert(90);
        myBST.insert(110);
        myBST.printRoot();
        myBST.printRightChild();
        myBST.printLeftChild();
    }
}
