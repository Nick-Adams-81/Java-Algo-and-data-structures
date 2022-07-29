package popularInterviewQuestions.strings;

public class Main {



    public static void main(String[] args) {
        ReverseString revStr = new ReverseString();
        char[] myArr = {'h', 'e', 'l', 'l', 'o'};

        revStr.reverseString(myArr);
        System.out.println(myArr);
    }
}
