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
        myDLL.append(5);
        myDLL.append(6);
        myDLL.printList();
        myDLL.printHead();
        myDLL.printTail();
        myDLL.printLength();

        System.out.println(myDLL.get(4).value);
        myDLL.set(5, 10);
        myDLL.printList();

        myDLL.insert(1, 500);
        myDLL.printList();
        myDLL.printHead();
        myDLL.printTail();
        myDLL.printLength();

        myDLL.remove(1);
        myDLL.printList();
        myDLL.printHead();
        myDLL.printTail();
        myDLL.printLength();



    }
}
