package queue;

public class Main {
    public static void main(String[] args) {

        Queue myQueue = new Queue(1);
        myQueue.printQueue();
        myQueue.printFirst();
        myQueue.printLast();
        myQueue.printLength();

        myQueue.enqueue(2);
        myQueue.printQueue();
        myQueue.printFirst();
        myQueue.printLast();
        myQueue.printLength();
    }
}
