//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    static void main(String[] args) {
        System.out.println("Hello World");
        // store roll nos for 5 students
        int[] rollnos = new int[5];

        // store the name of 5 students
        String[] name = new String[5];

        Student student = new Student();
        student.name = "student1";
        student.rno = 12;
        student.marks = 77.9f;
        System.out.println(student.name);
        System.out.println(student.marks);
        System.out.println(student.rno);

    }
}

// create a class
class Student{
    int rno;
    String name;
    float marks;
}