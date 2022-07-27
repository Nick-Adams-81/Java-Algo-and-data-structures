package popularInterviewQuestions.singleNumber;

public class Main {



    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 2, 1};

        SingleNumber singleNum = new SingleNumber();
        System.out.println(singleNum.singleNumber(arr));
        System.out.println(singleNum.advancedSingleNumber(arr));
    }
}
