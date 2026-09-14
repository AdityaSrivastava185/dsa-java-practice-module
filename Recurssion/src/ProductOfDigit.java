public class ProductOfDigit {
    static void main(String[] args) {
        int ans = productOfDigit(37);
        System.out.println(ans);
    }
    public static int productOfDigit(int num){
        if(num % 10 == num){
            return num;
        }
        return num % 10 * productOfDigit(num / 10);
    }
}
