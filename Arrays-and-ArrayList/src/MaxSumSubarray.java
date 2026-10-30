import java.util.ArrayList;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {1};
        int[] nums3 = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
       int max = nums[0];
       for(int i = 0; i < nums.length; i++){
           int sum = 0;
           for(int j = i; j < nums.length; j++){
               sum = sum + nums[j];
               if(sum > max){
                   max  = sum;
               }
           }
       }
       return max;
    }
}
