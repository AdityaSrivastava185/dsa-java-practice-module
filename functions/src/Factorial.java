public class Factorial {
    static void main(String[] args) {
        int n = 7;
        System.out.println(factorial(n));
    }
    // Q find the factorial of the number
    public static int factorial(int number){
        int fact = 1;

        while (number > 1) {
            fact = fact * number;
            number--;
        }

        return fact;
    }
}
