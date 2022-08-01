package popularInterviewQuestions.strings;

public class Main {



    public static void main(String[] args) {
        ReverseString revStr = new ReverseString();
        LongestCommomPrefix myPrefix = new LongestCommomPrefix();
        RepeatedDNASequence myDNA = new RepeatedDNASequence();
        LongestSubstringWithoutRepeatingChars substringChars = new LongestSubstringWithoutRepeatingChars();
        ValidParentheses isValid = new ValidParentheses();
        LongestPalindromicSubstring isPalindrome = new LongestPalindromicSubstring();
        DecodeString decoder = new DecodeString();
        ValidAnagram anagram = new ValidAnagram();
        GroupAnagrams anagrams = new GroupAnagrams();
        LongestValidParentheses longestParens = new LongestValidParentheses();

        char[] myArr = {'h', 'e', 'l', 'l', 'o'};
        String myString = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        String[] myStrArr = {"flower", "flow", "float"};
        String newString = "maddam";
        String[] stringArr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        revStr.reverseString(myArr);
        System.out.println(myArr);
        System.out.println(myPrefix.longestPrefix(myStrArr));
        System.out.println(myDNA.findDNASubString(myString));
        System.out.println(substringChars.lengthOfLongestSubstring("abcdeffg"));
        System.out.println(isValid.isValid("[]{}"));
        System.out.println(isPalindrome.longestPalindrome(newString));
        System.out.println(decoder.decodeString("3[a]2[bc]"));
        System.out.println(anagram.isValidanagram("anagram", "nagaram"));
        System.out.println(anagram.optimizedIsValidAnagram("accc", "ccac"));
        System.out.println(anagrams.groupAnagrams(stringArr));
        System.out.println(longestParens.longestValidParentheses("(()"));
    }
}
