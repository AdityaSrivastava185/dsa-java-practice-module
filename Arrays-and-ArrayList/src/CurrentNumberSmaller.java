import java.util.Arrays;

public class CurrentNumberSmaller {
    static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    // function to return the array of number smaller than the current number
    public  static int[] smallerNumbersThanCurrent(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    if(j != i){
                        count = count + 1;
                    }
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
