package hashTables;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();
        myHashTable.printTable();
        myHashTable.set("nails", 30);
        myHashTable.set("hammer", 60);
        myHashTable.set("screws", 10);
        myHashTable.set("washers", 12);
        myHashTable.printTable();

    }


}
