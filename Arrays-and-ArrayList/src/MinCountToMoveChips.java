public class MinCountToMoveChips {
    public static void main(String[] args) {
        int[] arr = {1,1000000000};
        System.out.println("ans" + minCostToMoveChips(arr));
    }
    public static int minCostToMoveChips(int[] arr){
        int even = 0;
        int odd = 0;
        int min;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2  == 0){
                even = even + 1;
            } else{
                odd = odd + 1;
            }
        }
        if(odd < even){
            min = odd;
        } else{
            min = even;
        }
        System.out.println(odd);
        System.out.println(even);
        return min;
    }
}
