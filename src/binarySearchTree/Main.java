package binarySearchTree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(100);
        myBST.insert(50);
        myBST.insert(150);
        myBST.printRoot();
        myBST.printLeft();
        myBST.printRight();
    }
}
