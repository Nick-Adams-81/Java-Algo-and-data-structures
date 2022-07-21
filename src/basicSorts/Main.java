package basicSorts;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {4, 2, 6, 1, 5, 3};
        System.out.println(Arrays.toString(myArray));
        BubbleSort.bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));

        int[] myArray2 = {11, 7, 9, 10, 8, 12};
        System.out.println(Arrays.toString(myArray2));
        SelectionSort.selectionSort(myArray2);
        System.out.println(Arrays.toString(myArray2));

        int[] myArray3 = {18, 13, 17, 14, 16, 15};
        System.out.println(Arrays.toString(myArray3));
        InsertionSort.insertionSort(myArray3);
        System.out.println(Arrays.toString(myArray3));
    }
}
