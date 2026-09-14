public class SumOfDigits {
    static void main(String[] args) {
        int ans = sumOfdigit(7);
        System.out.println(ans);
    }
    public static int sumOfdigit(int num){
        if(num == 0){
            return 0;

        }
        return num % 10 + sumOfdigit(num / 10);

    }
}
