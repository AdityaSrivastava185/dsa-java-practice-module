public class BinarySeach {
    static void main(String[] args) {
        // The condition for the binary search is that the array should be sorted in either ascending
        // or descending order
        int[] numbers = {2, 4, 6, 9, 11, 12, 14, 20, 26, 48};
        int target = 2 ;
        System.out.println(BinarySearch(numbers, target));
    }
    public static int BinarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element in the array
            int middle = start + (end - start) / 2;
            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
