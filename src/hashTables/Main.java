package hashTables;

public class Main {

    public static void main(String[] args) {

      HashTable myHashTable = new HashTable();
      myHashTable.printTable();
      myHashTable.set("nails", 50);
      myHashTable.set("hammer", 100);
      myHashTable.set("bolts", 25);
      myHashTable.set("screws", 55);
      myHashTable.printTable();

    }


}
