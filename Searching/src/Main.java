public class Main{
    static void main(String[] args) {
        // Linear Search
        // Linear search is one of the searching algorithm which is used to search for specific element in the array
        // Time complexity
        // Best - o(1) => constant, worst - o(N) => N is the size of the array
        int[] numbers = {18, 12, 9, 14, 77, 50};
        int targetNumber = 12;
        // System.out.println(LinearSearch(numbers, targetNumber));
        System.out.println(BooleanSearch(numbers, targetNumber));
    }
    // take the array of integers and return the index of the target element
    // if target element not found then return -1
    public static int LinearSearch(int[] arr, int targetNum){
        if(arr.length == 0) {
            return -1;
        }
        // running the for loop
        for(int i = 0; i<arr.length; i++){
            // for every element , check weather it is equals to the target element
            if(arr[i] == targetNum){
                return i;
            }
        }
        return -1;
    }

    // Boolean search - to return the true or false if target element is present in array or not present in array
    public static boolean BooleanSearch(int[] arr, int targetNum){
        if(arr.length == 0){
            return false;
        }
        // run the loop
        for (int i = 0; i < arr.length; i++) {
            // check for the condition
            if(arr[i] == targetNum){
                return true;
            }
        }
        return false;
    }
}