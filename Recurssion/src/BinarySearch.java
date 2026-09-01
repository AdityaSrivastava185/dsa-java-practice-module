public class BinarySearch {
    static void main(String[] args) {
        int[]nums = {1,2,3,4,5,7};
        System.out.println(RecursiveBinarySearch(nums, 3,0, nums.length-1));
    }
    public static int RecursiveBinarySearch(int[]nums, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int middle = start + (end - start) / 2;
        if(nums[middle] == target){
            return middle;
        }
        if(target < nums[middle]){
            // make sure to return if there is return type
            return  RecursiveBinarySearch(nums, target, start, end-1);
        }

        return RecursiveBinarySearch(nums, target, middle + 1, end);

    }
}
