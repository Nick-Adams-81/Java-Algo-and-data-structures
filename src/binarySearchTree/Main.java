package binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        System.out.println(myBST.root);
        myBST.insert(100);
        myBST.insert(50);
        myBST.insert(150);
        myBST.insert(25);
        myBST.insert(200);
        System.out.println("Root: " + myBST.root.value);
        System.out.println("Right: " + myBST.root.right.value);
        System.out.println("Left: " + myBST.root.left.value);
        System.out.println(myBST.contains(150));


    }
}
