package stack;

public class Main {
    public static void main(String[] args) {

        Stack myStack = new Stack(1);
        myStack.printStack();
        myStack.printHeight();
        myStack.printTop();
        myStack.push(3);
        myStack.push(7);
        myStack.printStack();
        myStack.printHeight();
        myStack.printTop();
        myStack.pop();
        myStack.printStack();
        myStack.printTop();

    }
}
