import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        int[] numbers = {3,1,5,24,2};
        BubbleSort(numbers);
    }
    // bubble sort
    public static void BubbleSort(int[] arr){
        boolean swapped;
        if(arr.length == 0){
            System.out.println("No element found in the given array");
        }
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                // check if the i is less than j then swap the elements
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}