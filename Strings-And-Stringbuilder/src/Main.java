public class Main{
    static void main(String[] args) {
       String name = "hello world";
        System.out.println(name);
        // the new object is created in the heap memory with the value - hello - and the same reference variable
        // is pointing to new value and the previous value will be collected by garbage collector
        name = "hello";
        System.out.println(name);
    }

}