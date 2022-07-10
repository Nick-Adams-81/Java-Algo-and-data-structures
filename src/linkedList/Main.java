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
        myLinkedList.prepend(0);
        myLinkedList.printList();
//        myLinkedList.getHead();
        myLinkedList.removeFirst();
//        myLinkedList.printList();

        myLinkedList.insert(1, 119);
        myLinkedList.insert(2, 120);
        myLinkedList.printList();

       myLinkedList.set(1, 23);
       myLinkedList.printList();
       myLinkedList.remove(1);
       myLinkedList.printList();
       myLinkedList.remove(1);
       myLinkedList.printList();




    }
}
