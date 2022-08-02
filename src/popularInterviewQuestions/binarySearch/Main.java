package popularInterviewQuestions.binarySearch;

public class Main {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        RotateSortedArray rotatedArr = new RotateSortedArray();
        int[] myArr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch.search(myArr, 7));
        System.out.println(rotatedArr.search(myArr, 4));
    }





}
