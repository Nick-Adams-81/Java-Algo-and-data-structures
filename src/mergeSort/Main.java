package mergeSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        System.out.println(Arrays.toString(MergeSort.merge(arr1, arr2)));
    }
}
