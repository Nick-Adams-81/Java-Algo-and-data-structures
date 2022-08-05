package popularInterviewQuestions.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BuyAndSellStock myStock = new BuyAndSellStock();
        MoveZeros moveZeros = new MoveZeros();
        TwoSum twoSum = new TwoSum();
        ContainsDuplicate duplicates = new ContainsDuplicate();
        LengthOfLastWord lastWord = new LengthOfLastWord();
        PlaceFlowers flowers = new PlaceFlowers();
        BuyAndSellStockII moreStock = new BuyAndSellStockII();

        int[] myArr = {7, 1, 5, 3, 8, 4};
        int[] zerozArr = {1, 0, 4, 23, 0, 8, 12};
        int[] moreZeroz = {0, 4, 8, 0, 1, 2, 0, 9, 12, 0, 7, 13};
        int[] myTwoSum = {2, 7, 11, 15};
        int[] dupes = {1, 2, 5, 8, 5};
        int[] flowerBed = {1, 0, 0, 0, 1};
        int[] newFlowerBed = {1, 0, 0, 0, 1, 0, 0, 0, 1};
        int[] myStockTwo = {7, 1, 5, 3, 6, 4};
        String str = "hello world";

        System.out.println(myStock.maxProfit(myArr));
        moveZeros.moveZeros(zerozArr);
        System.out.println(Arrays.toString(zerozArr));
        moveZeros.optimizedMoveZeros(moreZeroz);
        System.out.println(Arrays.toString(moreZeroz));
        System.out.println(Arrays.toString(twoSum.twoSum(myTwoSum, 18)));
        System.out.println(duplicates.containsDuplicate(dupes));
        System.out.println(lastWord.lengthOfLastWord(str));
        System.out.println(flowers.canPlaceFlowers(flowerBed, 1));
        System.out.println(flowers.optimizedPlaceFlowers(newFlowerBed, 2));
        System.out.println(moreStock.maxProfit(myStockTwo));

    }
}
