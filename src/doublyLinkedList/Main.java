package doublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.printList();

        myDLL.append(2);
        myDLL.append(3);
        myDLL.printHead();
        myDLL.printTail();
        myDLL.getLength();
        myDLL.printList();

        myDLL.removeLast();
        myDLL.printHead();
        myDLL.printTail();
        myDLL.getLength();
        myDLL.printList();

        myDLL.prepend(0);
        myDLL.printHead();
        myDLL.printTail();
        myDLL.getLength();
        myDLL.printList();

        myDLL.removeFirst();
        myDLL.printHead();
        myDLL.printTail();
        myDLL.getLength();
        myDLL.printList();
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);
        myDLL.printList();


        System.out.println(myDLL.get(4).value);
        System.out.println("");
        myDLL.set(3, 44);
        myDLL.printList();



    }
}
