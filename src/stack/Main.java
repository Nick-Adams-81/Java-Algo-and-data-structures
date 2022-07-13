package stack;

public class Main {
    public static void main(String[] args) {

        Stack myStack = new Stack(12);
        myStack.printStack();
        myStack.getStackHeight();
        myStack.printTop();

        myStack.push(23);
        myStack.printStack();
        myStack.getStackHeight();
        myStack.printTop();

        myStack.push(34);
        myStack.printStack();
        myStack.getStackHeight();
        myStack.printTop();

        myStack.pop();
        myStack.printStack();
        myStack.getStackHeight();
        myStack.printTop();

        myStack.pop();
        myStack.printStack();
        myStack.getStackHeight();
        myStack.printTop();



    }
}
