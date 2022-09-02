package popularInterviewQuestions.TwoPointers;

public class IsSubsequence {

    public boolean isSubstring(String s, String t) {
        if(s.isEmpty()) return true;
        int pointer1 = 0;
        int pointer2 = 0;
        while(pointer1 < s.length() && pointer2 < t.length()) {
            if(s.charAt(pointer1) == t.charAt(pointer2)) {
                pointer1++;
                pointer2++;
            } else {
                pointer2++;
            }
        }
        return pointer1 == s.length();
    }
}
