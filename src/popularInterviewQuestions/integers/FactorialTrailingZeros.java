package popularInterviewQuestions.integers;

public class FactorialTrailingZeros {


    // TC: O(log n) SC: O(1)
    public int trailingZeros(int n) {
        int count = 0;
        for(int i = 5; i <= n; i = i * 5) {
            count = count + n / i;
        }
        return count;
    }
}
