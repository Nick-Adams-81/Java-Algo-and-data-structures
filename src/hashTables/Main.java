package hashTables;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();
        myHashTable.printTable();
        myHashTable.set("nails", 30);
        myHashTable.set("hammer", 60);
        myHashTable.set("screws", 10);
        myHashTable.set("washers", 12);
        myHashTable.set("mjolnir", 10000);
        myHashTable.set("storm-breaker", 200000);
        myHashTable.set("test", 1);
        myHashTable.printTable();
        System.out.println(myHashTable.get("hammer"));
        System.out.println(myHashTable.get("mjolnir"));
        System.out.println(myHashTable.keys());

    }


}
