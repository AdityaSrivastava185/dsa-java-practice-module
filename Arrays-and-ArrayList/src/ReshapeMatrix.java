import java.util.ArrayList;
import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrixReshape(nums, 1,4)));
    }
    public static int[][] matrixReshape(int[][] arr, int r, int c){
        int[][] ans = new int[r][c];
        ArrayList<Integer> list = new ArrayList<>();

        // Check whether reshaping is possible
        if (r * c != arr.length * arr[0].length) {
            return arr;
        }

        // Flatten the original matrix
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                list.add(arr[row][col]);
            }
        }

        // Fill the new matrix
        int ptr = 0;

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                ans[row][col] = list.get(ptr);
                ptr++;
            }
        }

        return ans;
    }
}
