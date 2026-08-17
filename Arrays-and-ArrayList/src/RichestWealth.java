import java.util.Arrays;

public class RichestWealth {
    static void main(String[] args) {
        int[][] nums = {
                {1,5},
                {7, 3},
                {3,5}
        };
        System.out.println(maximumWealth(nums));
    }
    public static int maximumWealth(int[][] nums){
        int maxWealth = 0;
        for (int i = 0; i < nums.length; i++) {
            int wealth = 0;
            for (int j = 0; j < nums[i].length; j++) {
                wealth = wealth + nums[i][j];
            }
            if (wealth > maxWealth){
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}
