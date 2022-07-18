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

        myDLL.removeFirst();
        myDLL.printList();
        myDLL.printHead();
        myDLL.printTail();
        myDLL.printLength();
        myDLL.append(3);
        myDLL.append(4);
        myDLL.prepend(0);
        myDLL.printList();
        myDLL.printHead();
        myDLL.printTail();
        myDLL.printLength();

        System.out.println(myDLL.get(2).value);

        myDLL.set(4, 5000);
        myDLL.printList();
        myDLL.printHead();
        myDLL.printTail();
        myDLL.printLength();

        myDLL.insert(2, 2000);

        myDLL.printList();
        myDLL.printHead();
        myDLL.printTail();
        myDLL.printLength();


    }
}
