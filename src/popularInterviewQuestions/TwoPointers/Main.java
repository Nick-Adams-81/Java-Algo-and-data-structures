package popularInterviewQuestions.TwoPointers;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        IsSubsequence mySubsequence = new IsSubsequence();
        SortedSquares mySquares = new SortedSquares();
        RemoveDuplicatesFromSortedArray removeDupes = new RemoveDuplicatesFromSortedArray();
        TrappingRainWater water = new TrappingRainWater();

        String string1 = "hell";
        String string2 = "hello";

        int[] squares = {-4, -1, 0, 3, 10};
        int[] sortedArr = {1, 1, 2, 3, 4, 5, 5, 5, 6, 7};
        int[] rainWater = {4, 2, 0, 3, 2, 5, 3, 5};

        System.out.println(mySubsequence.isSubstring(string1, string2));
        System.out.println(Arrays.toString(mySquares.sortedSquares(squares)));
        System.out.println(removeDupes.removeDuplicates(sortedArr));
        System.out.println(water.trappingRainWater(rainWater));

    }
}
