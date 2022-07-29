package popularInterviewQuestions.integers;

public class FactorialTrailingZeros {


    public int trailingZeros(int x) {
        int count = 0;
        for(int i = 5; i <= x; i = i * 5) {
            count = count + x / i;
        }
        return count;
    }

}
