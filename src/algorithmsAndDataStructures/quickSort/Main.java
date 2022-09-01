package algorithmsAndDataStructures.quickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArr = {4, 6, 1, 7, 3, 2, 5};
        QuickSort.quickSort(myArr);
        System.out.println(Arrays.toString(myArr));



    }
}
