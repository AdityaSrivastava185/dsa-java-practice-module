package CustomQueues;

public class CustomQueue {
    private int[] data;
    private int front = 0;
    private int rear = -1;

    public CustomQueue(int capacity) throws Exception{
        if(capacity <= 0){
            throw new Exception("The queue is empty");
        }
        data = new int[capacity];
    }

    public boolean offer(int value) throws Exception{
        if(rear == data.length - 1){
            throw new Exception("The queue is already full");
        }
        data[++rear] = value;
        return true;
    }
    public int pop() throws Exception{
        if(front > rear){
            throw new Exception("Can not remove element from the empty queue");
        }
        int removed = data[0];

        for (int i = 1; i < rear; i++) {
            data[i - 1] = data[i];
        }
        rear-- ;

        return removed;
    }
    public int size() {
        return front > rear ? 0 : rear - front + 1;
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }

}
