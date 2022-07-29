package popularInterviewQuestions.integers;

public class PalindromeNumber {

    public boolean numberPalindrome(int x) {
        if(x < 0 || (x != 0 && x % 10 == 0)) return false;
        int reversed = 0;
        int num = x;
        while(num > reversed) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num = num / 10;
        }
        return num == reversed / 10 || num == reversed;
    }

}
