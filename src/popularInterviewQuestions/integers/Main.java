package popularInterviewQuestions.integers;

public class Main {



    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 2, 1};
        ReverseInteger revInt = new ReverseInteger();


        SingleNumber singleNum = new SingleNumber();
        System.out.println(singleNum.singleNumber(arr));
        System.out.println(singleNum.advancedSingleNumber(arr));
        System.out.println(revInt.reverse(1234567899));
    }
}
