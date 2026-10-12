package polymorphism;

public class Circle extends Shapes{
    @Override // this is annotation and used to check weather it is overriding the parent method
    void area(){
        System.out.println("I am in circle");
    }
}
