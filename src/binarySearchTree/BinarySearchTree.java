package binarySearchTree;

public class BinarySearchTree {

    Node root;

    class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
        }
    }

    public void printRoot() {
        System.out.println("Root: " + root.value);
    }

    public void printLeftChild() {
        System.out.println("Left child: " + root.left.value);
    }

    public void printRightChild() {
        System.out.println("Right child: " + root.right.value);
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) root = newNode;
        Node temp = root;
        while(true) {
            if(newNode.value == temp.value) return false;
            if(newNode.value < temp.value) {
                if(temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if(temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }

    }

}
