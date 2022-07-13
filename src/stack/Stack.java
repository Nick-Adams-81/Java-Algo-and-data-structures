package stack;

public class Stack {

    Node top;
    int height;

    class Node {
        Node next;
        int value;
        Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("");
    }

}
