package hashTables;

public class Main {

    public static void main(String[] args) {

        HashTable myHash = new HashTable();
        myHash.printTable();
        myHash.set("hammer", 50);
        myHash.set("nails", 10);
        myHash.set("screws", 15);
        myHash.set("washers", 15);
        myHash.set("lumber", 75);
        myHash.set("tiles", 120);
        myHash.printTable();
        System.out.println(myHash.get("tiles"));

    }


}
