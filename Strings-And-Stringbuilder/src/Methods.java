import java.util.Arrays;

public class Methods {
    static void main(String[] args) {
        String name = "name1 name2";
        System.out.println(Arrays.toString((name.toCharArray())));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('a'));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
