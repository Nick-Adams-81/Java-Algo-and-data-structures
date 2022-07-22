package basicSorts;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArr = {5, 2, 6, 1, 3, 4};
        System.out.println(Arrays.toString(myArr));
        BubbleSort.bubbleSort(myArr);
        System.out.println(Arrays.toString(myArr));
    }
}
