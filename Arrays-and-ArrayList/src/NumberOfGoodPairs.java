public class NumberOfGoodPairs {
    static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j <= nums.length-1; j++){
                if(nums[i] == nums[j]){
                    if(i < j){
                        count = count + 1;
                    }
                }
            }
        }
        return count;
    }
}
