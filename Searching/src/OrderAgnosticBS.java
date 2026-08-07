public class OrderAgnosticBS {
    static void main(String[] args) {
        int[] number = {77,43,22,12,10,9,8,7,6,5,4,3,2,1,0};
        int target = 0;
        System.out.println("The length of array - " + number.length);
        System.out.println(OrderAgnosticBinarySearch(number, target));
    }
    public static int OrderAgnosticBinarySearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int middle = start + (end - start) / 2;
            if (target == arr[middle]) return middle;
            if(arr[start] < arr[end]){
                if(target > arr[middle]){
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else{
                if(target > arr[middle]){
                    end = middle - 1;
                } else{
                    start = middle + 1;
                }
            }
        }
//        if(arr[start] < arr[end]){
//            while(start <= end){
//                // find the mid element of the array
//                int middle = start + (end - start) / 2;
//                if(target > arr[middle]){
//                    start = middle + 1;
//                } else if(target < arr[middle]){
//                    end = middle - 1;
//                } else{
//                    return  middle;
//                }
//            }
//        } else{
//            while (start <= end){
//                int middle = start + (end - start) / 2;
//                if(target > arr[middle]){
//                    end = middle - 1;
//                } else if(target < arr[middle]){
//                    start  =middle + 1;
//                } else {
//                    return middle;
//                }
//            }
//        }
        return -1;
    }
}
