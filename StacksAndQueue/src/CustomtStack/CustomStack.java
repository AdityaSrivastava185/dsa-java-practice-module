package CustomtStack;

public class CustomStack {
    private int[] data;
    private int ptr = -1;

    public CustomStack(int capacity){
        if(capacity <= 0){
            throw new IllegalArgumentException("Capacity has to the positive number");
        }
        data = new int[capacity];
    }

    public boolean push(int value){
        if(isFull()){
            return false;
        }
        data[++ptr] = value;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("can not remove from the empty stack");
        }
        return data[ptr--];
    }

    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("cna not find top value from the empty stack");
        }
        return data[ptr];
    }

    public int size(){
        return ptr + 1;
    }

    public void display(){
        System.out.println("TOP => ");
        for (int i = ptr; i >= 0 ; i--) {
            System.out.println(data[ptr] + " ");
        }
        System.out.println();
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
