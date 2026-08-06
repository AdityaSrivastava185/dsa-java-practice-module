import java.lang.reflect.Array;
import java.util.Arrays;

public class MinNumber {
    static void main(String[] args) {
        int[] number = {1,2,3,0,4,5};
        System.out.println(Minimum(number));
    }
    public static int Minimum(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int minNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minNumber){
                minNumber = arr[i];
            }
        }
        return minNumber;
    }
}


