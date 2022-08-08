package popularInterviewQuestions.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BuyAndSellStock myStock = new BuyAndSellStock();

        int[] stock = {7, 1, 5, 3, 6, 4};

        System.out.println(myStock.maxProfit(stock));

    }
}
