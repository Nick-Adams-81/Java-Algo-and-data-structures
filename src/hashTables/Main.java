package hashTables;

public class Main {

    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.set("nails", 100);
        myHashTable.set("hammer", 1400);
        myHashTable.set("lumber", 80);
        myHashTable.set("tile", 45);
        myHashTable.set("bolts", 30);
        myHashTable.set("screws", 50);
        myHashTable.printTable();
        System.out.println(myHashTable.get("screws"));
        System.out.println(myHashTable.get("nails"));

    }


}
