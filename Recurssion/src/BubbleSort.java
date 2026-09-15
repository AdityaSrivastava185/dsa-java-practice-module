import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
        int[] nums = {4,3,2,1};
        bubbleSort(nums, nums.length - 1, 0);
        System.out.println(Arrays.toString(nums));
    }
    public static void bubbleSort(int[] nums, int r, int col){
        if (r == 0) {
            return;
        }
        if (col < r) {

            if (nums[col] > nums[col+1]) {
                // swap the element
                int temp = nums[col];
                nums[col] = nums[col+1];
                nums[col+1] = temp;
            }

            bubbleSort(nums, r, col+1);
        } else {
            bubbleSort(nums, r-1, 0);
        }
    }
}
