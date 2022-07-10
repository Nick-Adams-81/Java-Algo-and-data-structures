package linkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.printList();
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.printList();
        myLinkedList.removeLast();
        myLinkedList.printList();


    }
}
