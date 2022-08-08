package popularInterviewQuestions.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BuyAndSellStock myStock = new BuyAndSellStock();
        MoveZeros moveZeros = new MoveZeros();
        TwoSum twoSum = new TwoSum();
        ContainsDuplicate containsDupes = new ContainsDuplicate();
        LengthOfLastWord lastWord = new LengthOfLastWord();
        PlaceFlowers flowerbed = new PlaceFlowers();
        BuyAndSellStockII stock2 = new BuyAndSellStockII();

        int[] stock = {7, 1, 5, 3, 6, 4};
        int[] zeros = {0, 3, 5, 0, 12, 0, 4, 6};
        int[] moreZeros = {9, 3, 0, 6, 1, 0, 0, 8, 4};
        int[] twosum = {2, 7, 11, 13};
        int[] duplicates = {1, 2, 3, 4, 5, 6, 7};
        int[] flowers = {1, 0, 0, 0, 1, 0, 0, 0, 1};
        int[] stockTwo = {7, 1, 5, 3, 6, 4};
        String str = "length of last word in this sentence";

        System.out.println(myStock.maxProfit(stock));
        moveZeros.moveZeros(zeros);
        System.out.println(Arrays.toString(zeros));
        moveZeros.eficientMoveZeros(moreZeros);
        System.out.println(Arrays.toString(moreZeros));
        System.out.println(Arrays.toString(twoSum.twoSum(twosum, 18)));
        System.out.println(containsDupes.containsDuplicates(duplicates));
        System.out.println(lastWord.lengthOfLastWord(str));
        System.out.println(flowerbed.canPlaceFlowers(flowers, 2));
        System.out.println(stock2.maxProfit(stockTwo));

    }
}
