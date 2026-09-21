import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int[] numbers = {-7, -6, -5, -3, 0, 2, 4, 5, 1, 3};
        selectionSortSimple(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    // Selection sort
    public static void SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
static int getMaxIndex(int[] arr, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
        if (arr[max] < arr[i]) {
            max = i;
        }
    }
    return max;
}
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void selectionSortSimple(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = 0;
            for (int j = 0; j <= lastIndex; j++) {
                if(arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }
            int temp = arr[lastIndex];
            arr[lastIndex] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
}
