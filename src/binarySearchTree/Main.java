package binarySearchTree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(50);
        myBST.insert(100);
        myBST.insert(25);
        System.out.println("Root: " + myBST.root.value);
        System.out.println("Right: " + myBST.root.right.value);
        System.out.println("Left: " + myBST.root.left.value);
    }
}
