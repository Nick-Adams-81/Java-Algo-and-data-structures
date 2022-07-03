public class BigO {

    // Big o = O(n)
    // reason this is O(n) is because in this case we run the same number of operations as we pass in, in this case 10
    public static void printItems(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
