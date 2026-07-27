import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        System.out.print("Please enter the number - ");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("your roll no is " +  rollno);

//        String name = input.next();
//        String FullName = input.nextLine();
//
//        float marks = input.nextFloat();

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.print("The sum of the two give nums - " + sum);
    }
}
