package linkedList;

public class Main {

    public static void main(String[] args) {


        LinkedList myLinkedList = new LinkedList(1);


        myLinkedList.append(2);
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.getLength();

        myLinkedList.removeLast();
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.getLength();

    }
}
