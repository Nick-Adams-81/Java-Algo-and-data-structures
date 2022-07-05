import java.sql.SQLOutput;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
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
        // O(1)
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    public void getHead() {
        // O(1)
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        // O(1)
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        // O(1)
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        // O(1)
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLastNode() {
        // O(n)
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        // O(1)
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirstNode() {
        // O(1)
        if(length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node getNode(int index) {
        // O(n)
        if(index < 0 || index >= length) return null;
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean insert(int index, int value) {
        // O(n)
        if(index < 0 || index > length) return false;
        if(index == 0) {
            prepend(value);
            return true;
        }
        if(index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = getNode(index -1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public boolean setNode(int index, int value) {
        // O(n)
        Node temp = getNode(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirstNode();
        if(index == length -1) return removeLastNode();

        Node prev = getNode(index -1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

}
