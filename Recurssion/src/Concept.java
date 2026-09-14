public class Concept {
    static void main(String[] args) {
        fun(5);
    }
    public static void fun(int num){
        if(num == 0){
            return ;
        }
        System.out.println(num);
        // fun(num--);
        fun(--num);
    }
}
