import java.util.Arrays;

public class HighestAltitude {
    static void main(String[] args) {
        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] arr){
        int[] gain = new int[arr.length + 1];
        int maxAltitude = 0;
        gain[0] = 0;
        for (int i = 0; i < arr.length ; i++) {
            gain[i+1] = arr[i] + gain[i];
        }
        for (int i = 0; i < gain.length; i++) {
            if(gain[i] >  maxAltitude){
                maxAltitude = gain[i];
            }
        }
        System.out.println(Arrays.toString(gain));
        return maxAltitude;
    }
}
