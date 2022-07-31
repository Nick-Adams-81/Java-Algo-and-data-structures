package popularInterviewQuestions.strings;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChars {

    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if(!map.containsKey(ch)) {
                map.put(ch, right);
            } else {
                left = Math.max(left, map.get(ch) + 1);
                map.put(ch, right);
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }

}
