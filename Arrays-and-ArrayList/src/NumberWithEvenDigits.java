public class NumberWithEvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 2, 6, 8739};
        System.out.println(evenDigitCount(arr));
    }
    public static int evenDigitCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int digitcount = 0;
            while(num > 0){
                digitcount = digitcount + 1;
                // remove the last digit
                num = num / 10;
            }
            if(digitcount % 2 == 0){
                count = count + 1;
            }
        }
        return count;
    }
}
