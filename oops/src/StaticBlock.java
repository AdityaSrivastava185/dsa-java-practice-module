public class StaticBlock {
    static int a = 10;
    static int b;
    // It only runs one time , when the class is loaded first time and object is created
    static{
        System.out.println("This is static block scope");
        b = a * 5;
    }
    static void main(String[] args){
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        System.out.println(obj.a + " " + obj.b);
    }
}
