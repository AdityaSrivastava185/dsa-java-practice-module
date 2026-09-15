import java.util.Arrays;

public class SelectionSortRecursion {
    static void main(String[] args) {
        int[] nums = {4,3,2,1};
        selection(nums, nums.length, 0, 0);
        System.out.println(Arrays.toString(nums));
    }
    public static void selection(int[] nums, int r, int c, int max){
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (nums[c] > nums[max]) {
                selection(nums, r, c+1, c);
            } else {
                selection(nums, r, c+1, max);
            }
        } else {
            int temp = nums[max];
            nums[max] = nums[r-1];
            nums[r-1] = temp;
            selection(nums, r-1, 0, 0);
        }
    }
    
}
