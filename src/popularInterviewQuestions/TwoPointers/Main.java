package popularInterviewQuestions.TwoPointers;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        IsSubsequence mySubsequence = new IsSubsequence();
        SortedSquares mySquares = new SortedSquares();

        String string1 = "hell";
        String string2 = "hello";

        int[] squares = {-4, -1, 0, 3, 10};

        System.out.println(mySubsequence.isSubstring(string1, string2));
        System.out.println(Arrays.toString(mySquares.sortedSquares(squares)));

    }
}
