import java.util.ArrayList;

public class Operators {
    static void main(String[] args) {
        // printing the addition of char
        System.out.println('a' + 'b');
        // printing the addition of string
        System.out.println("a" + "b");
        // printing
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 3);
        // printing string with arraylist
        System.out.println("a" + new ArrayList<>());
        // The + operator is only defined for primitives and when one of the values is string
    }
}
