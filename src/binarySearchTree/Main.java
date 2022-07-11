package binarySearchTree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(12);
        myBST.insert(6);
        myBST.insert(7);
        myBST.insert(20);
        myBST.insert(14);
        System.out.println(myBST.root.value);
        System.out.println("Root: " + myBST.root.value);
        System.out.println(myBST.root.left.right.value);
    }
}
