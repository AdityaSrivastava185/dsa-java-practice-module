public class SearchInRange {
    static void main(String[] args) {
        int[] numbers = {18, 12, -7, 3, 14, 28};
        int targetNumber = -7;
        int startNum = 2;
        int endNum = numbers.length-1;
        System.out.println(SearchInRange(numbers, targetNumber, startNum, endNum));
    }
    // to find the element within the specified index of the array
    // return the index if the element found in the array else return -1
    public static int SearchInRange(int[] arr, int targetNum, int startIndex, int EndIndex){
        if(arr.length == 0){
            return -1;
        }
        // run the loop
        for (int i = startIndex; i <= EndIndex ; i++) {
            // check the element found in the range
            if(arr[i] == targetNum){
                return i;
            }
        }
        return -1;
    }
}
