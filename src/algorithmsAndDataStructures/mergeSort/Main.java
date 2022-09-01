package algorithmsAndDataStructures.mergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArr = {4, 7, 1, 3, 6, 2, 5};
        int[] myArr2 = {1, 2, 3, 4};
        int[] myArr3 = {5, 6, 7, 8};
        System.out.println(Arrays.toString(MergeSort.merge(myArr2, myArr3)));

        System.out.println(Arrays.toString(MergeSort.mergeSort(myArr)));

    }
}
