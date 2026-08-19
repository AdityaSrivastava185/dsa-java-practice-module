import java.util.Arrays;

public class ShuffleArray {
    static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
        System.out.println(nums.length);
    }
    public static int[] shuffle(int[] nums, int n){
        int ans[] = new int[nums.length];
       int j = 0;
        for (int i = 0; i < n; i++) {
            ans[j] = nums[i];
            ans[j+1] = nums[i+n];
            j = j+2;
        }
        return ans;
    }
}
