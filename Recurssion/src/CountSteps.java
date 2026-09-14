public class CountSteps {
    static void main(String[] args) {
        int ans = countSteps(1);
        System.out.println(ans);
    }
    public static int countSteps(int num){
        if(num == 0){
            return 0;
        }
        if(num % 2 == 0){
            return 1 + countSteps(num / 2);
        }
        return 1 + countSteps(num - 1);
    }
}
