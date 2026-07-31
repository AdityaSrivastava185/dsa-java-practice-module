import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // function to find the sum of two numbers
        // Sum();
        int ans = Sum2(10, 20);
        System.out.println(ans);
    }

    static void Sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        int result = num1 + num2;
        System.out.print("The sum of the two given numbers: " + result);
    }

    public static int Sum2(int num1, int num2){
        return num1 + num2;
    }

}