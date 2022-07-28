package popularInterviewQuestions.integers;

public class PalindromeNumber {


    public boolean numberPalindrome(int num) {
        if(num < 0 || (num != 0 && num % 10 == 0)) return false;
        int reverse = 0;
        int number = num;
        while(number > reverse) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return number == reverse / 10 || number == reverse;
    }

}
