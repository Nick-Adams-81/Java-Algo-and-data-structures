package algorithmsAndDataStructures.hashTables;

public class Main {

    public static void main(String[] args) {

        HashTable myHashTable = new HashTable();

        myHashTable.printTable();
        myHashTable.set("Hammer", 10);
        myHashTable.set("Nails", 5);
        myHashTable.set("Boards", 25);
        myHashTable.set("Mjolnir", 400);
        myHashTable.set("Storm-breaker", 645);
        myHashTable.printTable();
        System.out.println(myHashTable.get("Hammer"));
    }


}
