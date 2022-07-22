package basicSorts;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArr = {5, 2, 3, 6, 1, 4};
        System.out.println(Arrays.toString(myArr));
        BubbleSort.bubbleSort(myArr);
        System.out.println(Arrays.toString(myArr));

        int[] myArr2 = {9, 12, 10, 8, 11, 7};
        System.out.println(Arrays.toString(myArr2));
        SelectionSort.selectionSort(myArr2);
        System.out.println(Arrays.toString(myArr2));

        int[] myArr3 = {17, 13, 18, 16, 14, 15};
        System.out.println(Arrays.toString(myArr3));
        InsertionSort.insertionSort(myArr3);
        System.out.println(Arrays.toString(myArr3));
    }
}
