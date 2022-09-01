package popularInterviewQuestions.integers;

public class Main {



    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 1};
        ReverseInteger revInt = new ReverseInteger();
        PalindromeNumber numPal = new PalindromeNumber();
        FactorialTrailingZeros trailingZeros = new FactorialTrailingZeros();
        PowerOfXAndN myPow = new PowerOfXAndN();
        SingleNumber singleNum = new SingleNumber();

        System.out.println(FizzBuzz.fizzBuzz(50));

        System.out.println(singleNum.singleNumber(arr));
//        System.out.println(singleNum.advancedSingleNum(arr));
//        System.out.println(revInt.reverseInteger(12345));
//        System.out.println(numPal.numberPalindrome(122));
//        System.out.println(trailingZeros.trailingZeros(25));
//        System.out.println(myPow.myPow(2, 4));
//        System.out.println(NthRootOfNum.root(16.0, 4));


    }
}
