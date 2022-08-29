package algorithmsAndDataStructures.stack;

public class Main {
    public static void main(String[] args) {

        Stack myStack = new Stack(10);
        myStack.printStack();
        myStack.printHeight();
        myStack.getTop();

        myStack.push(20);
        myStack.printStack();
        myStack.printHeight();
        myStack.getTop();


    }
}
