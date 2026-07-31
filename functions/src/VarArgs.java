import java.util.Arrays;

public class VarArgs {
    static void main(String[] args) {
        // func(2,3,4,4,5,6,4,4,3,4,7);
        func2(10, "aditya", "kunal");
    }
    public static void func(int ...v){ // internally it is taking an array of integers
        System.out.println(Arrays.toString(v));
    }
    public static void func2(int a, String ...v){
        System.out.println(a);
        System.out.println(Arrays.toString(v));
    }
}
