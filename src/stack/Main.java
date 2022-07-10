package stack;

public class Main {
    public static void main(String[] args) {

        Stack myStack = new Stack(1);
        myStack.printStack();
        myStack.printHeight();
        myStack.printTop();
        myStack.push(0);
        myStack.printStack();
        myStack.printHeight();
        myStack.printTop();

    }
}
