package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 20;
        int c = a / b;
        try{
            divide(a,b);
            throw new Exception("Throwing exception inside of the try block");
        } catch (MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }  catch (Exception e){
            System.out.println(e.getMessage());
            // there can be only one finally block, the user can not create multiple finally block
        } finally {
            System.out.println("It will always run");
        }
    }
    public static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero ");
        }
        return a / b ;
    }
}
