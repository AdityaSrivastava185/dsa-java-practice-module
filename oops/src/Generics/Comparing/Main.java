package Generics.Comparing;

public class Main {
    public static void main(String[] args) {
        Student Kunal = new Student(123, 89);
        Student aman = new Student(1234, 89.4f);
//        if(Kunal < aman){
//            System.out.println("Aman has more marks");
//        }
        if(Kunal.compareTo(aman) < 0){
            System.out.println("Aman has more marks ");
        }
    }
}
