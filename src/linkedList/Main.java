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

        myLinkedList.prepend(0);
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.getLength();

        myLinkedList.removeFirst();
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.getLength();
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        System.out.println(myLinkedList.get(2).value);

        myLinkedList.insert(2, 20);
        myLinkedList.printList();
        myLinkedList.printHead();
        myLinkedList.printTail();
        myLinkedList.getLength();


    }
}
