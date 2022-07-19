package hashTables;



public class HashTable {

    Node[] dataMap;
    int size = 7;


    class Node {
        String key;
        int value;
        Node next;
        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while(temp != null) {
                System.out.println(i + ": { " + temp.key + ": " + temp.value + " }");
                temp = temp.next;
            }
        }
    }


}