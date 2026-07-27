import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // print hello world
        System.out.println("Hello World");

        // taking input
        System.out.print("please enter the input - ");
        Scanner input = new Scanner(System.in);
        // input the integer
        System.out.println(input.nextInt());

        // input the string
        System.out.println(input.next());

        // input the string and print the entire line
        System.out.println(input.nextLine());

    }
}