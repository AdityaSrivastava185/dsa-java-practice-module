import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        int[] numbers = {3,1,5,4,22};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    // bubble sort
    public static void bubbleSort(int[] arr){
        boolean swapped;
        if(arr.length == 0){
            System.out.println("The array does not contain element to sort");
        }
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // if the value at index j is less the value at index j-1 , then swap the element
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}