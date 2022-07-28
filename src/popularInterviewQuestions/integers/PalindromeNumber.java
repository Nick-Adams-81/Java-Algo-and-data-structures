package popularInterviewQuestions.integers;

public class PalindromeNumber {

    public boolean numberPalindrome(int x) {
        // TC: O(log n) SC: O(1)
        if(x < 0 || (x != 0 && x % 10 == 0)) return false;
        int reverse = 0;
        int num = x;
        while(num > reverse) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        return num == reverse / 10 || num == reverse;
    }

}
