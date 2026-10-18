package cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human aman = new Human(98, "Aman");
//        Human twin = new Human(aman);
        // there is an interface called clonnable that can be user if we are trying to clone the objects
        Human twin = (Human)aman.clone();
        System.out.println(twin.age + " " + twin.name);
    }
}
