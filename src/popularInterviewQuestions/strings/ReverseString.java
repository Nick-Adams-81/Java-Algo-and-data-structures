package popularInterviewQuestions.strings;


public class ReverseString {

    public void reverseString(char[] string) {
        int left = 0;
        int right = string.length -1;
        while(left < right) {
            char temp = string[left];
            string[left] = string[right];
            string[right] = temp;
            left++;
            right--;
        }
    }


}
