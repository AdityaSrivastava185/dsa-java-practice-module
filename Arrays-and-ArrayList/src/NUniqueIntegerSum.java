import java.lang.reflect.Array;
import java.util.Arrays;

public class NUniqueIntegerSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(6)));
    }
    // Ques - find N unique integer sum up to 0
    public static int[] sumZero(int num){
        int number = 1;
        int[] ans = new int[num];
        if(num % 2 == 0){
            //even
            for(int i = 0; i < ans.length; i++){
                ans[i] = number;
                ans[i+1] = -number;
                number = number + 1;
                i++;
            }
        } else{
            //odd
            for(int i = 0; i < ans.length-1; i++){
                ans[i] = number;
                ans[i+1] = -number;
                i++;
                number = number + 1;
            }
        }
        return ans;
    }
}
