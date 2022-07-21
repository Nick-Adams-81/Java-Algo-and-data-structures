

public class Main {

    public static void methodOne() {
        methodTwo();
        System.out.println("One");

    }

    public static void methodTwo() {
        methodThree();
        System.out.println("Two");
    }

    public static void methodThree() {
        System.out.println("Three");
    }

    public static int factorial(int n) {
        if(n == 1) return 1;
        return n * factorial(n -1);
    }

    // main method
    public static void main(String[] args) {
        methodOne();
        int myFac = factorial(4);
        System.out.println(myFac);
    }
}
