package stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(1);

        myStack.push(2);
        myStack.push(3);
        myStack.print();
        myStack.getHeight();
        myStack.pop();
        myStack.print();
        myStack.getHeight();

    }
}
