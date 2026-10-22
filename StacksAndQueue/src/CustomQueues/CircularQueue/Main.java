package CustomQueues.CircularQueue;

import CustomQueues.DynamicQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        DynamicQueue queue2 = new DynamicQueue();


//        queue.offer(10);
//        queue.offer(20);
//        queue.offer(30);
//        queue.offer(40);
//        queue.offer(50);
//
//        queue.display();
//
//        System.out.println("Removed: " + queue.poll());
//        System.out.println("Removed: " + queue.poll());
//
//        queue.offer(60);
//        queue.offer(70);
//
//        System.out.println("Queue in logical order:");
//        queue.display();
//
//        System.out.println("Front: " + queue.peek());
//        System.out.println("Size: " + queue.size());


        for (int i = 10; i <= 80; i += 10) {
            queue2.offer(i);
            System.out.println(
                    "Added " + i +
                            ", size = " + queue2.size() +
                            ", capacity = " + queue2.capacity()
            );
        }

        System.out.println("Queue contents:");
        queue2.display();

        System.out.println("Removed: " + queue2.poll());
        System.out.println("Front now: " + queue2.peek());
        queue2.display();

    }
}
