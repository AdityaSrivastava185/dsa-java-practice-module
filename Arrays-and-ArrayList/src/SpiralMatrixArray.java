import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixArray {

    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] nums2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        System.out.println(spiralOrderMatrix(nums2));
    }

    public static List<Integer> spiralOrderMatrix(int[][] nums) {

        List<Integer> ans = new ArrayList<>();

        int top = 0;
        int bottom = nums.length - 1;
        int left = 0;
        int right = nums[0].length - 1;
//        System.out.println(bottom);

        while (top <= bottom && left <= right) {


            for (int j = left; j <= right; j++) {
                ans.add(nums[top][j]);
            }
            top++;


            for (int i = top; i <= bottom; i++) {
                ans.add(nums[i][right]);
            }
            right--;


            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans.add(nums[bottom][j]);
                }
                bottom--;
            }


            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(nums[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}