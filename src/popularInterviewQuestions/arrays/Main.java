package popularInterviewQuestions.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BuyAndSellStock myStock = new BuyAndSellStock();
        MoveZeros moveZeros = new MoveZeros();
        TwoSum twoSum = new TwoSum();

        int[] stock = {7, 1, 5, 3, 6, 4};
        int[] zeros = {0, 3, 5, 0, 12, 0, 4, 6};
        int[] moreZeros = {9, 3, 0, 6, 1, 0, 0, 8, 4};
        int[] twosum = {2, 7, 11, 13};

        System.out.println(myStock.maxProfit(stock));
        moveZeros.moveZeros(zeros);
        System.out.println(Arrays.toString(zeros));
        moveZeros.eficientMoveZeros(moreZeros);
        System.out.println(Arrays.toString(moreZeros));
        System.out.println(Arrays.toString(twoSum.twoSum(twosum, 18)));

    }
}
