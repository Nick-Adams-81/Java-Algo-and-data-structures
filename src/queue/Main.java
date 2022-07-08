package queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(1);

        myQueue.printQueue();
        myQueue.getLength();
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.printQueue();
        myQueue.getLength();
        myQueue.dequeue();
        myQueue.printQueue();
        myQueue.getLength();
        myQueue.dequeue();
        myQueue.printQueue();
        myQueue.getLength();

    }
}
