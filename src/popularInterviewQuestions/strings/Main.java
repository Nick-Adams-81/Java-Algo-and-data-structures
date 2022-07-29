package popularInterviewQuestions.strings;

public class Main {



    public static void main(String[] args) {
        ReverseString revStr = new ReverseString();
        LongestCommomPrefix myPrefix = new LongestCommomPrefix();
        char[] myArr = {'h', 'e', 'l', 'l', 'o'};

        String[] myStrArr = {"flower", "flow", "float"};
        revStr.reverseString(myArr);
        System.out.println(myArr);
        System.out.println(myPrefix.longestPrefix(myStrArr));
    }
}
