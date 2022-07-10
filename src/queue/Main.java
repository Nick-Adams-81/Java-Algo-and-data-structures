package queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(1);
        myQueue.printQueue();
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.enqueue(2);
        myQueue.printQueue();
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.enqueue(3);
        myQueue.printQueue();
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.dequeue();
        myQueue.printQueue();
        myQueue.getFirst();
        myQueue.getLast();



    }
}
