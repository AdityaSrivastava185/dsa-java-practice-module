package inheritance;

public class Main {
    static void main(String[] args) {
//        Box box = new Box();
        Box box = new Box(12);
//        Box box2 = new Box(box);
//        System.out.println(box.l + " " + box.w + " " + box.h);

        BoxWeight box2 = new BoxWeight();
        BoxWeight box3 = new BoxWeight(2,4,2,2);
        BoxWeight box4 = new BoxWeight(box3);
        BoxPrice box5 = new BoxPrice();
        System.out.println(box2.h + " " + box2.weight);
        System.out.println(box3.weight + " " +  box3.w + " " + box3.h + " " + box3.l);
        System.out.println(box3.weight + " " + box3.h);
        System.out.println(box5.price);
    }
}
