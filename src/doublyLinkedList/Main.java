package doublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDll = new DoublyLinkedList(1);
        myDll.printList();
        myDll.append(2);
        myDll.append(3);
        myDll.printList();
        myDll.getLength();
        myDll.removeLast();
        myDll.printList();
        myDll.getLength();
        myDll.prepend(0);
        myDll.printList();
        myDll.getLength();
    }
}
