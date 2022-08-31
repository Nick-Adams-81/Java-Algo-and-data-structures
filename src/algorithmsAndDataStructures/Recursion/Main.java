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
    public static void main(String[] args) {
        methodOne();

    }
}
