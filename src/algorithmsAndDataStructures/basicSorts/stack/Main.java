package algorithmsAndDataStructures.basicSorts.stack;

public class Main {
    public static void main(String[] args) {

        Stack myStack = new Stack(1);
        myStack.printStack();
        myStack.printTop();
        myStack.printHeight();

        myStack.push(2);
        myStack.push(300);
        myStack.printStack();
        myStack.printTop();
        myStack.printHeight();

        myStack.pop();
        myStack.printStack();
        myStack.printTop();
        myStack.printHeight();



    }
}
