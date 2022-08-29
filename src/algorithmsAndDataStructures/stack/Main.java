package algorithmsAndDataStructures.stack;

public class Main {
    public static void main(String[] args) {

        Stack myStack = new Stack(10);
        myStack.printStack();
        myStack.printHeight();
        myStack.getTop();

        myStack.push(20);
        myStack.push(25);
        myStack.push(30);
        myStack.printStack();
        myStack.printHeight();
        myStack.getTop();

        myStack.pop();
        myStack.printStack();
        myStack.printHeight();
        myStack.getTop();


    }
}
