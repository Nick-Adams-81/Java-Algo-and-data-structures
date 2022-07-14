package stack;

public class Main {
    public static void main(String[] args) {

        Stack myStack = new Stack(1);
        myStack.printStack();
        myStack.printTop();
        myStack.printHeight();

        myStack.push(2);
        myStack.push(3);
        myStack.printStack();
        myStack.printTop();
        myStack.printHeight();

    }
}
