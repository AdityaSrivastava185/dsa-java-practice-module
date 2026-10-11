package inheritance;

public class BoxPrice extends BoxWeight {
    int price;

    BoxPrice(){
        super();
        this.price = 1;
    }

    BoxPrice(BoxPrice other){
        super();
        this.price = other.price;
    }
}
