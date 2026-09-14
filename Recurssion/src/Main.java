public class Main{
    static void main(String[] args) {
        // Recursion - Function calling another function
         print(1);
    }
    public static void print(int num) {
        System.out.println(num);
        if(num == 5){
            return;
        }
        print(num+1);
    }
}