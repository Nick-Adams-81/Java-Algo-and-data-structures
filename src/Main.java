

public class Main {


    // main method
    public static void main(String[] args) {







        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.printList();
        myLinkedList.printLength();
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.printList();
        myLinkedList.printLength();
        myLinkedList.removeLast();
        myLinkedList.printList();
        myLinkedList.printLength();
        myLinkedList.prependList(0);
        myLinkedList.printList();
        myLinkedList.printLength();
        myLinkedList.removeFirst();
        myLinkedList.printList();
        myLinkedList.printLength();
        System.out.println(myLinkedList.get(1).value);
        myLinkedList.insertNode(1, 100);
        myLinkedList.insertNode(2, 101);
        myLinkedList.printList();
        myLinkedList.set(1, 10);
        myLinkedList.printList();
        myLinkedList.remove(2);
        myLinkedList.printList();
        myLinkedList.reverseList();
        myLinkedList.printList();





    }
}
