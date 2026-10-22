package CustomQueues;

public class DynamicQueue {
    private int[] data;
    private int front = 0;
    private int size = 0;

    public DynamicQueue() {
        data = new int[4];
    }

    public void offer(int value) {
        if (size == data.length) {
            grow();
        }

        int rear = (front + size) % data.length;
        data[rear] = value;
        size++;
    }

    private void grow() {
        int[] newData = new int[data.length * 2];

        for (int i = 0; i < size; i++) {
            int oldIndex = (front + i) % data.length;
            newData[i] = data[oldIndex];
        }

        data = newData;
        front = 0;
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
