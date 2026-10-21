import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        // uisng array deque as a stack

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(29);
        stack.push(45);
        stack.push(78);

//        System.out.println("Top- " + stack.peek());
//        System.out.println("Removed- " + stack.pop());
//        System.out.println("Removed- " + stack.pop());
//        System.out.println("Top now- " + stack.peek());
//        System.out.println("Empty? - " + stack.isEmpty());
//        System.out.println("Size- " + stack.size());

        //using array deque as a queue

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(23);
        queue.offer(45);
        queue.offer(99);

        System.out.println("Front: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Front now: " + queue.peek());
        System.out.println("Empty? " + queue.isEmpty());
        System.out.println("Size: " + queue.size());
    }
}
