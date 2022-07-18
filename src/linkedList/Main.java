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

        myLinkedList.prepend(0);
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();

        myLinkedList.removeFirst();
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();

        System.out.println(myLinkedList.get(1).value);

        myLinkedList.insert(2, 3);
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();

        myLinkedList.set(2, 30);
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();




    }
}
