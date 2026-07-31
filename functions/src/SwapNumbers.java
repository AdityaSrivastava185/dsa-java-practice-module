public class SwapNumbers {
    static void main(String[] args) {
        Swap(10,20);
    }
    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
