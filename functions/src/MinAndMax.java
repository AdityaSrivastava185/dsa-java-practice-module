import java.util.Scanner;

public class MinAndMax {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Java program to find largest and smallest of three numbers");

        System.out.println("Please enter first number :");
        int first = scanner.nextInt();

        System.out.println("Please enter second number :");
        int second = scanner.nextInt();

        System.out.println("Please enter third number :");
        int third = scanner.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", first, second, third, largest);
        System.out.printf("smallest of three numbers %d, %d, and %d: %d %n", first, second, third, smallest);
    }
    // Q- Find the max number of the given three number
    public static int largest(int first, int second, int third){
        int max = first;
        if(second > max){
            max = second;
        }
        if(third > max){
            max = third;
        }
        return max;
    }
    // Q Find the smallest number among the three numbers
    public static int smallest(int first, int second, int third){
        int smallest = first;
        if(second < smallest){
            smallest = second;
        }
        if(third < second){
            smallest = third;
        }
        return smallest;
    }
}
