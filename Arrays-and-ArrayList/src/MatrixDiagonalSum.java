public class MatrixDiagonalSum {
    public static void main(String[] args) {
        // find the matrix diagonal sum
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int[][] arr3 = {{5}};
        System.out.println(diagonalSum(arr3));
    }
    public static int diagonalSum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum = sum + arr[i][i];
           if(i != (arr.length - 1 - i)){
               sum = sum + arr[i][arr.length - i -1];
           }
        }
        return sum;
    }
}
