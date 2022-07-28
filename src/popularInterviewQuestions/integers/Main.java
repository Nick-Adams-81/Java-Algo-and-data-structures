package popularInterviewQuestions.integers;

public class Main {



    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 2, 1};
        ReverseInteger revInt = new ReverseInteger();
        PalindromeNumber numPal = new PalindromeNumber();
        FactorialTrailingZeros trailingZeros = new FactorialTrailingZeros();
        PowerOfXAndN myPow = new PowerOfXAndN();


        SingleNumber singleNum = new SingleNumber();
        System.out.println(singleNum.singleNumber(arr));
        System.out.println(singleNum.advancedSingleNumber(arr));
        System.out.println(revInt.reverse(1234567899));
        System.out.println(numPal.numberPalindrome(12213));
        System.out.println(trailingZeros.trailingZeros(125));
        System.out.println(myPow.myPow(4, 3));


    }
}
