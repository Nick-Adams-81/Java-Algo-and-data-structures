package binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        System.out.println("Root = " + myBST.root);
        myBST.insert(20);
        myBST.insert(17);
        myBST.insert(25);
        System.out.println("Root = " + myBST.root.value);
        System.out.println("Right child = " + myBST.root.right.value);
        System.out.println("Left child = " + myBST.root.left.value);

    }
}
