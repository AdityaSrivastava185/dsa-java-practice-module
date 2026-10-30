public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] arr){
       if(arr.length == 0){
           return 0;
       }
       int count = 1;
       for(int i = 1; i < arr.length; i++){
           if(arr[i] != arr[i-1]){
               arr[count] = arr[i];
               count = count + 1;
           }
       }
       return count;
    }
}
