public class Fibo {
    static void main(String[] args) {
        int n = 3;
        System.out.println(Fibonacci(n));
    }
    public static int Fibonacci(int n){
      if(n < 2){
          return n;
      }
        return  Fibonacci(n-1) + Fibonacci(n-2);

    }
}

