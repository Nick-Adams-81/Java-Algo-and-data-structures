package hashTables;

public class Main {

    public static void main(String[] args) {


        HashTable myHashTable = new HashTable();
        myHashTable.printTable();
        myHashTable.set("hammer", 25);
        myHashTable.set("nails", 15);
        myHashTable.set("washers", 10);
        myHashTable.set("screws", 35);
        myHashTable.set("lumber", 125);
        myHashTable.set("mjolnir", 100000);
        myHashTable.set("storm-breaker", 200000);
        myHashTable.set("infinity gauntlet", 1000000000);
        myHashTable.set("hammer", 25);
        myHashTable.set("screw driver", 25);
        myHashTable.printTable();
        System.out.println(myHashTable.get("hammer"));

        System.out.println(myHashTable.keys());

    }


}
