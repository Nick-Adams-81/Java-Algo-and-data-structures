package popularInterviewQuestions.strings;

import java.util.Stack;

public class ValidAnagram {

    // SC: O(1) TC: O(n)
    public boolean isValidanagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] counter = new int[26];
        for(int i = 0; i < s.length() -1; i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int j : counter) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    // TC: O(n) SC: O(1)
    public boolean optimizedIsValidAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] counter = new int[26];
        for(int i = 0; i < s.length() -1; i++) {
            counter[s.charAt(i) - 'a']++;
        }
        for(int j = 0; j < t.length() -1; j++) {
            counter[t.charAt(j) - 'a']--;
            if(counter[t.charAt(j) - 'a'] < 0) return false;
        }
        return true;
    }

}
