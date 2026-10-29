import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,12,11,7};
        int[] nums2 = {3,2,4};
        int target = 18;
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
