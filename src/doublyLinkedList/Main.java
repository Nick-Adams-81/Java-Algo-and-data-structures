package doublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.printList();

        myDLL.append(2);
        myDLL.printList();
        myDLL.removeLast();
        myDLL.printList();
        myDLL.append(2);
        myDLL.prepend(0);
        myDLL.printList();
        myDLL.removeFirst();
        myDLL.printList();
        System.out.println(myDLL.get(1).value);
        myDLL.set(1, 30);
        myDLL.printList();
        myDLL.insert(2, 500);
        myDLL.printList();
        myDLL.remove(1);
        myDLL.printList();


    }
}
