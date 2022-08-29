package algorithmsAndDataStructures.queue;

public class Main {
    public static void main(String[] args) {

        Queue myQueue = new Queue(10);
        myQueue.printQueue();
        myQueue.printFirst();
        myQueue.printLast();
        myQueue.printLength();

        myQueue.enqueue(15);
        myQueue.enqueue(20);
        myQueue.printQueue();
        myQueue.printFirst();
        myQueue.printLast();
        myQueue.printLength();

        myQueue.dequeue();
        myQueue.printQueue();
        myQueue.printFirst();
        myQueue.printLast();
        myQueue.printLength();
    }
}
