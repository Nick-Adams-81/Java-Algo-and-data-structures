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
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        if(tail.next == null) {
            System.out.println("");
        }
    }

    public  void getHead() {
        System.out.println("Head: " + head);
    }

    public void getTail() {
        System.out.println("Tail: " + tail);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
         Node newNode = new Node(value);
         if(length == 0) {
             head = newNode;
             tail = newNode;
         } else {
             tail.next = newNode;
             newNode.prev = tail;
             tail = newNode;
         }
         length++;
    }

    public Node removeLast() {
        if(length == 0) return null;
        if(length == 1) {
            head = null;
            tail = null;
        }
        Node temp = tail;
        tail = tail.prev;
        temp.prev = null;
        tail.next = null;
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) return null;
        if(length == 1) {
            head = null;
            tail = null;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
        head.prev = null;
        length--;
        return temp;

    }
}
