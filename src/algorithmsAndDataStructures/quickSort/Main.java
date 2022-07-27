package algorithmsAndDataStructures.quickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArr = {7, 6, 5, 4, 3, 2, 1};

        QuickSort.quickSort(myArr);
        System.out.println(Arrays.toString(myArr));

    }
}
