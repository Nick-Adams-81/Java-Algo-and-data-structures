package popularInterviewQuestions.integers;

public class Main {



    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 2, 1};


        SingleNumber singleNum = new SingleNumber();
        System.out.println(singleNum.singleNumber(arr));
        System.out.println(singleNum.advancedSingleNumber(arr));
    }
}
