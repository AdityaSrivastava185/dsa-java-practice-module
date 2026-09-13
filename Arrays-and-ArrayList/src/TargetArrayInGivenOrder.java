
import java.util.Arrays;

public class TargetArrayInGivenOrder {
    static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {

        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            // Shift elements to the right
            for (int j = i; j > index[i]; j--) {
                target[j] = target[j - 1];
            }

            // Insert the new element
            target[index[i]] = nums[i];
        }

        return target;
    }
}
