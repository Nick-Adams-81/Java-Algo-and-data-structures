package basicSorts;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minindex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minindex]) {
                    minindex = j;
                }
            }
            if (i != minindex) {
                int temp = array[i];
                array[i] = array[minindex];
                array[minindex] = temp;
            }

        }
    }
}
