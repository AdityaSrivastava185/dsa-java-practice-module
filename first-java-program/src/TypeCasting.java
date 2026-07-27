import java.util.Scanner;

public class TypeCasting {
    static void main(String[] args) {
        // the source type should be greater than the destination type conversion
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();

        // type casting
        int num2 = (int)(77.57f);
        System.out.println(num2);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1
        System.out.println(b);
    }
}
