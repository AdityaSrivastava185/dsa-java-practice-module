package CustomQueues.CircularQueue;

public class CircularQueue {
    private int[] data;
    private int front = 0;
    private int size = 0;

    public CircularQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException(
                    "Capacity must be positive"
            );
        }

        data = new int[capacity];
    }

    public boolean offer(int value) {
        if (isFull()) {
            return false;
        }

        int rear = (front + size) % data.length;
        data[rear] = value;
        size++;

        return true;
    }

    public int poll() {
        if (isEmpty()) {
            throw new IllegalStateException(
                    "Cannot remove from an empty queue"
            );
        }

        int removed = data[front];
        front = (front + 1) % data.length;
        size--;

        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException(
                    "Cannot peek at an empty queue"
            );
        }

        return data[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return data.length;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            int index = (front + i) % data.length;
            System.out.print(data[index] + " ");
        }

        System.out.println();
    }
}
