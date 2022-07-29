package popularInterviewQuestions.integers;

public class Main {



    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 2, 1};
        ReverseInteger revInt = new ReverseInteger();
        PalindromeNumber numPal = new PalindromeNumber();
        FactorialTrailingZeros trailingZeros = new FactorialTrailingZeros();
        PowerOfXAndN myPow = new PowerOfXAndN();
        SingleNumber singleNum = new SingleNumber();

        System.out.println(FizzBuzz.fizzBuzz(50));

        System.out.println(singleNum.singleNumber(arr));
        System.out.println(singleNum.advancedSingleNum(arr));


    }
}
