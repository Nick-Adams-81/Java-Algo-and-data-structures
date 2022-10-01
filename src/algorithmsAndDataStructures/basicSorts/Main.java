package algorithmsAndDataStructures.basicSorts;


import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {



    public static void main(String[] args) {



        long startTimeMills1 = System.currentTimeMillis();
        long startTime1 = TimeUnit.MILLISECONDS.toSeconds(startTimeMills1);
        int[] myArr = new int[100000];
        for(int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) (Math.random() * 100000);
            for(int j = 0; j < i; j++) {
                if(myArr[i] == myArr[j]) {
                    i--;
                    break;
                }
            }
        }

        long endTimeMills1 = System.currentTimeMillis();
        long endTime1 = TimeUnit.MILLISECONDS.toSeconds(endTimeMills1);
        long elapsedTime = (endTime1 - startTime1);
        System.out.println("the loop took: " + elapsedTime + " seconds");


        long startTimeMills = System.currentTimeMillis();
        long startTime3 = TimeUnit.MILLISECONDS.toSeconds(startTimeMills);
        BubbleSort.bubbleSort(myArr);
//        SelectionSort.selectionSort(myArr);
//        InsertionSort.insertionSort(myArr);
        long endTimeMills = System.currentTimeMillis();
        long endTime3 = TimeUnit.MILLISECONDS.toSeconds(endTimeMills);
        long elapsedTime3 = (endTime3 - startTime3);

        System.out.println("Bubble sort took: " + elapsedTime3 + " seconds");
//        System.out.println("Selection sort took " + convert + " seconds");
//        System.out.println("insertion sort took: " + elapsedTime3 + " seconds");


    }
}
