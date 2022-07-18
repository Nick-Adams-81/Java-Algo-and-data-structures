package linkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();

        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();

        myLinkedList.removeLast();
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();


    }
}
