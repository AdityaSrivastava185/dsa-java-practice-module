package CustomQueues;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        queue.display();

        System.out.println("Removed: " + queue.pop());
        System.out.println("Front: " + queue.pop());

        queue.display();
    }
}
