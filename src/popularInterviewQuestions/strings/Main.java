package popularInterviewQuestions.strings;

public class Main {



    public static void main(String[] args) {
        ReverseString revStr = new ReverseString();
        LongestCommomPrefix myPrefix = new LongestCommomPrefix();
        RepeatedDNASequence myDNA = new RepeatedDNASequence();
        LongestSubstringWithoutRepeatingChars substringChars = new LongestSubstringWithoutRepeatingChars();
        ValidParenthaseses isValid = new ValidParenthaseses();
        char[] myArr = {'h', 'e', 'l', 'l', 'o'};

        String myString = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        String[] myStrArr = {"flower", "flow", "float"};
        revStr.reverseString(myArr);
        System.out.println(myArr);
        System.out.println(myPrefix.longestPrefix(myStrArr));
        System.out.println(myDNA.findDNASubString(myString));
        System.out.println(substringChars.lengthOfLongestSubstring("abcdeffg"));
        System.out.println(isValid.isValid("[]{}"));
    }
}
