package binarySearchTree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(100);
        myBST.insert(50);
        myBST.insert(150);
        myBST.insert(10);

        System.out.println(myBST.root.value);
        System.out.println(myBST.root.left.value);
        System.out.println(myBST.root.right.value);
        System.out.println(myBST.contains(10));


    }
}
