public class OddValuesInMatrix {
    static void main(String[] args) {
        int[][] arr = {{0,1},{1,1}};
        int row = 2;
        int col = 3;
        System.out.println(oddCells(arr, row, col));
    }
    public static int oddCells(int[][] indices, int row, int col){
       int[][] arr = new int[row][col];
       int count = 0;
        for (int irow = 0; irow < indices.length; irow++) {
            int r = indices[irow][0];
            int c = indices[irow][1];

            for (int j = 0; j < col; j++) {
                arr[r][j]++;
            }

            // poora column increment
            for (int j = 0; j < row; j++) {
                arr[j][c]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 != 0){
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
