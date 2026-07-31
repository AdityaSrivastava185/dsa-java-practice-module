public class FuntionOverloading {
    public static void main(String[] args) {
        displayInt(10, 20);


    }
    public static void displayInt(int a ){
        System.out.println(a);
    }

    public static void displayInt(int a , int b){
        System.out.println(a + " " +  b);
    }
}
