package doublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.printList();

        myDLL.append(2);
        myDLL.printHead();
        myDLL.printTail();
        myDLL.getLength();
        myDLL.printList();

    }
}
