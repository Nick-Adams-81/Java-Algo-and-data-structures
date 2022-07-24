package quickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArr = {2, 7, 5 ,1, 3, 6, 4};

        QiuckSort.quickSort(myArr);
        System.out.println(Arrays.toString(myArr));

    }
}
