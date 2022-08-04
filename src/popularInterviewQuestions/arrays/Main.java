package popularInterviewQuestions.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BuyAndSellStock myStock = new BuyAndSellStock();
        MoveZeros moveZeros = new MoveZeros();

        int[] myArr = {7, 1, 5, 3, 8, 4};
        int[] zerozArr = {1, 0, 4, 23, 0, 8, 12};
        int[] moreZeroz = {0, 4, 8, 0, 1, 2, 0, 9, 12, 0, 7, 13};
        System.out.println(myStock.maxProfit(myArr));
        moveZeros.moveZeros(zerozArr);
        System.out.println(Arrays.toString(zerozArr));
        moveZeros.optimizedMoveZeros(moreZeroz);
        System.out.println(Arrays.toString(moreZeroz));

    }
}
