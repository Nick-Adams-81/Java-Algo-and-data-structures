package algorithmsAndDataStructures.quickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArr = {3, 1, 7, 4, 2, 6, 5};

        QuickSort.quickSort(myArr);
        System.out.println(Arrays.toString(myArr));

    }
}
