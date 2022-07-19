package hashTables;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();
        myHashTable.printTable();
        myHashTable.set("nuts", 10);
        myHashTable.set("bolts", 15);
        myHashTable.set("nails", 20);
        myHashTable.set("hammer", 50);
        myHashTable.printTable();

    }


}
