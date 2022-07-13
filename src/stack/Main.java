package stack;

public class Main {
    public static void main(String[] args) {

        Stack myStack = new Stack(1);
        myStack.printStack();
        myStack.getStackHeight();
        myStack.printTop();

        myStack.push(2);
        myStack.printStack();
        myStack.getStackHeight();
        myStack.printTop();

        myStack.push(3);
        myStack.printStack();
        myStack.getStackHeight();
        myStack.printTop();


    }
}
