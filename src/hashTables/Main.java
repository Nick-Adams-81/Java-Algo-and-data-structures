package hashTables;

public class Main {

    public static void main(String[] args) {


        HashTable myHashTable = new HashTable();
        myHashTable.printTable();
        myHashTable.set("hammer", 25);
        myHashTable.set("nails", 15);
        myHashTable.set("washers", 10);
        myHashTable.set("screws", 35);
        myHashTable.printTable();
        System.out.println(myHashTable.get("hammer"));

        System.out.println(myHashTable.keys());

    }


}
