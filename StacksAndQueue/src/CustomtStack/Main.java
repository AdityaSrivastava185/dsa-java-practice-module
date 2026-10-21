package CustomtStack;

public class Main {
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();

        for (int i = 10; i <= 60; i += 10) {
            stack.push(i);
            System.out.println(
                    "Pushed " + i +
                            ", size = " + stack.size() +
                            ", capacity = " + stack.capacity()
            );
        }

        stack.display();

        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}
