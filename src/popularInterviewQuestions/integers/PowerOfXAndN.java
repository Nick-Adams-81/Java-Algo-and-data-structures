package popularInterviewQuestions.integers;

public class PowerOfXAndN {

    public double myPow(double x, int n) {
        double answer = 1.0;
        long num = n;
        if(n < 0) {
            num = -1 * num;

        }
        while (num > 0) {
            if(num % 2 == 0) {
                x = x * x;
                num = num / 2;
            } else {
                answer = answer * x;
                num = num -1;
            }
        }
        if(n < 0) {
            return 1.0 / answer;
        }
        return answer;
    }
}