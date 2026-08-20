import java.util.ArrayList;
import java.util.List;

public class NumberOfCandies {
    static void main(String[] args) {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        System.out.println(getMax(candies));
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] nums, int extraCandies){
        ArrayList<Boolean> ans = new ArrayList<Boolean>();
        int maxCandy = getMax(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] + extraCandies >= maxCandy){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
    public static int getMax(int[] nums){
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
