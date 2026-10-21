package CustomtStack;

import java.util.Arrays;

public class DynamicStack {
    private int[] data;
    private int ptr = -1;

    public DynamicStack(){
        data = new int[5];
    }

    public void push(int value){
        if (ptr == data.length - 1) {
            resize();
        }

        data[++ptr] = value;
    }

    public void resize(){
        data = Arrays.copyOf(data, data.length * 2);
    }

    public int pop(){
        if(ptr == -1){
            throw new IllegalStateException("cna not find top value from the empty stack");
        }
        return data[ptr--];
    }
    public int peek() {
        if (ptr == -1) {
            throw new IllegalStateException(
                    "Cannot peek at an empty stack"
            );
        }

        return data[ptr];
    }
    public int size() {
        return ptr + 1;
    }
    public int capacity() {
        return data.length;
    }
    public void display() {
        System.out.print("TOP -> ");

        for (int i = ptr; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }
}
