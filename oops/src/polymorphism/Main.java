package polymorphism;

public class Main {
    static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Shapes circle2 = new Circle();
        shape.area();
        circle.area();
        square.area();
        circle2.area();
    }
}
