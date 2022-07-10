package doublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDll = new DoublyLinkedList(1);
        myDll.printList();
        myDll.append(2);
        myDll.printList();
    }
}
