package basicSorts;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {4, 6, 2, 5, 1, 3};

        BubbleSort.bubbleSort(myArray);

        System.out.println(Arrays.toString(myArray));

        int[] myArray2 = {9, 7, 1, 4, 5};

        SelectionSort.selectionSort(myArray2);
        System.out.println(Arrays.toString(myArray2));
    }
}
