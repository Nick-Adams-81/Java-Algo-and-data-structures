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
        myDll.removeFirst();
        myDll.printList();
        myDll.append(3);
        myDll.append(4);
        myDll.append(5);
        myDll.printList();
        System.out.println(myDll.get(4).value);
        myDll.set(5, 500);
        myDll.printList();
        myDll.insert(2, 123);
        myDll.printList();
        myDll.getLength();
        myDll.remove(2);
        myDll.printList();

    }
}
