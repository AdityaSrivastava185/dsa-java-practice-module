public class EvenOdd {
    static void main(String[] args) {
        int n = 90;
        System.out.println(EvenOdd(n));
    }
    // Q find the number is even or odd
    public static String EvenOdd(int number){
        if(number % 2 == 0){
            return "even";
        }
        return "odd";
    }
}
