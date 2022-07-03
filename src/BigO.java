public class BigO {

    // Big o = O(n)
    // explanation: O(n) is because in this case we run the same number of operations as we pass in, in this case 10
    public static void printItems(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // Big o = O(n) because we drop constants in Big o, the actual value of this code is n + n operations, or O(2n), we drop the 2 to get O(n)
        for(int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }

    // Big o = O(n^2)
    // explanation: every nested loop runs n times n, or n * n, in our case this runs n * n * n, or this would be O(n3), we simplify this to O(n^2)
    public static void printMoreItems(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}
