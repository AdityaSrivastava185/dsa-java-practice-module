package CustomQueues.CircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        queue.display();

        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());

        queue.offer(60);
        queue.offer(70);

        System.out.println("Queue in logical order:");
        queue.display();

        System.out.println("Front: " + queue.peek());
        System.out.println("Size: " + queue.size());
    }
}
