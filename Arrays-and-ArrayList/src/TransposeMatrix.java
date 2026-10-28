import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length ; col++ ){
                transpose[col][row] = matrix[row][col];
            }
        }
        return transpose;
    }
}
