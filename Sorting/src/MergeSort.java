import java.util.Arrays;

public class MergeSort {
    static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int[] ans = mergeSort(nums);
        mergeSortInPlace(nums, 0, nums.length);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(nums));

    }
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)) ;
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    public static int[] merge(int[] left, int[] right){
        int[] mix = new int[right.length + left.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < right.length && j < left.length) {
            if (right[i] < left[j]) {
                mix[k] = right[i];
                i++;
            } else {
                mix[k] = left[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < right.length) {
            mix[k] = right[i];
            i++;
            k++;
        }

        while (j < left.length) {
            mix[k] = left[j];
            j++;
            k++;
        }

        return mix;
    }
    // In place merge sort
    public static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
