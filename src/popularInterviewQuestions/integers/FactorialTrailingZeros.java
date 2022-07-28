package popularInterviewQuestions.integers;

public class FactorialTrailingZeros {


    public int trailingZeros(int num) {
        int count = 0;
        for(int i = 5; i <= num; i = i * 5) {
            count = count + num / i;
        }
        return count;
    }
}
