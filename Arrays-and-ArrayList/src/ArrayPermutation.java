
import java.util.Arrays;

public class ArrayPermutation {
    static void main(String[] args) {
        int[] nums = {0,1,2,3};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
