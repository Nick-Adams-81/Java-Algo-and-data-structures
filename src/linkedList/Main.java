package linkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.prepend(0);


        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();

        myLinkedList.removeLast();

        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();

        myLinkedList.removeFirst();

        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();

        System.out.println(myLinkedList.get(2).value);
        myLinkedList.insert(3, 500);

        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();

        myLinkedList.set(3, 50);
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();

        myLinkedList.remove(0);
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.printLength();
        myLinkedList.printList();
        myLinkedList.reverse();
        myLinkedList.printList();








    }
}
