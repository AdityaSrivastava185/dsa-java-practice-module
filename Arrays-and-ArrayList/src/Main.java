import java.util.Arrays;

public class Main{
    static void main(String[] args) {
        System.out.println("Hello World");
        //Arrays and Arraylist
        // syntax - datatype[] variable_name = new datatype[size];
        // store 5 roll numbers
        int rollnums[] = new int [5];
        rollnums[0] = 22;
        rollnums[1] = 88;
        rollnums[2] = 77;
        rollnums[3] = 33;
        rollnums[4] = 37;

        // System.out.println(Arrays.toString(rollnums));

        //or

        int rollnums2[] = {21, 23, 24, 22, 77};

        int ros[]; // declaration of array, ros is getting defined in the stack
        ros = new int[5]; // object is being created in the heap memory - initialisation
    }
}