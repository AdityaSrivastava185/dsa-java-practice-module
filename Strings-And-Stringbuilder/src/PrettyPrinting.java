public class PrettyPrinting {
    static void main(String[] args) {
        // printing till two digit decimal number
        float a = 453.7657f;
        System.out.printf("Formatted number is %.2f", a);
        // print the value of pi
        System.out.println(Math.PI);
        System.out.printf("PI value %.3f",Math.PI);
        // printing the order of values using placeholder in printf method
        System.out.println();
        System.out.printf("Hello this is %s %s", "Hello", "World");
    }
}
