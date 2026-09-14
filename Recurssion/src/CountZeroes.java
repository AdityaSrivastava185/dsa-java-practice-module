public class CountZeroes {
    static void main(String[] args) {
        int ans = countZeroes(1);
        System.out.println(ans);
    }
    public static int countZeroes(int num){
        if(num < 10){
            return 0;
        }
        int remainder = num % 10;
        if(remainder == 0){
            return 1 + countZeroes(num / 10);
        }
        return countZeroes(num / 10);
    }
}
