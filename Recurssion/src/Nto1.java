public class Nto1 {
    static void main(String[] args) {
        // Nto1(5);
        revNto1(5);
    }
    public static void Nto1(int num){
        if(num == 0){
            return ;
        }
        System.out.println(num);
        Nto1(num - 1);
    }
    public static void revNto1(int num){
        if(num == 0){
            return ;
        }
        revNto1(num - 1);
        System.out.println(num);
    }
}
