package algorithmsAndDataStructures.Recursion;

public class Main {

    public static void methodOne() {
        methodTwo();
        System.out.println("one");
    }

    public static void methodTwo() {
        methodThree();
        System.out.println("two");
    }

    public static void methodThree() {
        System.out.println("three");
    }

    public static int factorial(int n) {
        if(n == 1) return 1;
        return n * factorial(n -1);
    }
    public static void main(String[] args) {
        methodOne();
        System.out.println(factorial(4));

    }
}
