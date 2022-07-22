package mergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {1, 7, 9, 5, 3, 10, 2, 4, 8, 6};

        System.out.println(Arrays.toString(MergeSort.mergeSort(arr1)));

        System.out.println(Arrays.toString(arr1));



    }
}
