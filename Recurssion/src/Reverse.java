public class Reverse {
    static void main(String[] args) {
        reverseNumber(1234);
        System.out.println(sum);
    }
    static int sum = 0;
    public static void reverseNumber(int num){
        if(num == 0){
            return;
        }
        int remainder = num % 10;
        sum = sum * 10 + remainder;
        reverseNumber(num / 10);
    }
}
