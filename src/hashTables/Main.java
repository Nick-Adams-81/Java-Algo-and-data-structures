package hashTables;

public class Main {

    public static void main(String[] args) {

        HashTable myHash = new HashTable();
        myHash.printTable();

        myHash.set("hammer", 100);
        myHash.set("nails", 10);
        myHash.printTable();

    }


}
