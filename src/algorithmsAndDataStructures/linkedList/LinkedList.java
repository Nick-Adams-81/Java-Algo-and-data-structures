package algorithmsAndDataStructures.linkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    int length;

    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printHead() {
        System.out.println(head.value);
    }

    public void printTail() {
        System.out.println(tail.value);
    }

    public void printLength() {
        System.out.println(length);
    }
}
