public class Comparison {
    static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        System.out.println(a == b);
        String name = new String("name1");
        String name2 = new String("name1");
        System.out.println(name == name2);
        // only checking the value
        System.out.println(name.equals(name2));
        // getting the char at index
        System.out.println(name.charAt(0));
    }
}
