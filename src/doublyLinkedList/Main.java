package doublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.printList();
        myDLL.printHead();
        myDLL.printTail();
        myDLL.printLength();

        myDLL.append(2);
        myDLL.append(3);
        myDLL.printList();
        myDLL.printHead();
        myDLL.printTail();
        myDLL.printLength();

        myDLL.removeLast();
        myDLL.printList();
        myDLL.printHead();
        myDLL.printTail();
        myDLL.printLength();

        myDLL.prepend(0);
        myDLL.printList();
        myDLL.printHead();
        myDLL.printTail();
        myDLL.printLength();

    }
}
