import java.util.Arrays;

public class FlipImage {
    static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
       flipImage(arr);
        System.out.println(Arrays.deepToString(arr));
    }
    public static int[][] flipImage(int[][] arr){
        for (int row = 0; row < arr.length; row++) {
            int start = 0;
            int end = arr.length - 1;
            while(start < end){
                int temp = arr[row][start];
                arr[row][start] = arr[row][end];
                arr[row][end] = temp;
                start ++;
                end --;
            }
        }
        for(int row = 0 ; row < arr.length ; row++){
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == 1){
                    arr[row][col] = 0;
                } else {
                    arr[row][col] = 1;
                }
            }
        }
        return arr;
    }
}
