package doublyLinkedList;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int length;

    class Node {
        int value;
        Node next;
        Node prev;
        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public  void getHead() {
        System.out.println("Head: " + head);
    }

    public void getTail() {
        System.out.println("Tail: " + tail);
    }

    public void append(int value) {
         Node newNode = new Node(value);
         if(length == 0) {
             head = newNode;
             tail = newNode;
         } else {
             newNode.prev = tail;
             tail.next = newNode;
             tail = newNode;
         }
         length++;
    }
}
