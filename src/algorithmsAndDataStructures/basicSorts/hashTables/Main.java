package algorithmsAndDataStructures.basicSorts.hashTables;

public class Main {

    public static void main(String[] args) {

        HashTable myHash = new HashTable();
        myHash.printTable();

        myHash.set("hammer", 100);
        myHash.set("nails", 10);
        myHash.set("lumber", 220);
        myHash.set("tile", 25);
        myHash.printTable();

        System.out.println(myHash.get("nails"));

        System.out.println(myHash.keys());

    }


}
