

public class Main {



    // main method
    public static void main(String[] args) {

        // pointers
//        HashMap<String, Integer> map1 = new HashMap<>();
//        HashMap<String, Integer> map2 = new HashMap<>();
//        HashMap<String, Integer> map3 = new HashMap<>();

//        map1.put("Value", 11);
//        map2 = map1; // this is a "pointer" to map1
//
//        map1.put("Value", 22);
//        map3.put("value", 34);
//        map2 = map3; // this is a "pointer" to map3
//
//        System.out.println(map1);
//        System.out.println(map2);
//
//        map1 = map3; // we are "pointing" map1 to map3
//        System.out.println(map1);

        // linked list
        LinkedList myLinkedList = new LinkedList(1);
        //myLinkedList.append(2);
        myLinkedList.append(3);
        // 3 items - prints 123
//        myLinkedList.printList();
//        myLinkedList.removeLastNode();
//        // 2 items - prints 12
//        myLinkedList.printList();
//        myLinkedList.removeLastNode();
//        // 1 item - prints 1
//        myLinkedList.printList();

        myLinkedList.prepend(0);
        //myLinkedList.printList();
//        myLinkedList.removeFirstNode();
//        myLinkedList.printList();
        //System.out.println(myLinkedList.getNode(2).value);
        myLinkedList.insert(2, 2);
        myLinkedList.printList();
        myLinkedList.setNode(1, 89);
        myLinkedList.printList();
        myLinkedList.remove(1);
        myLinkedList.printList();

    }
}
