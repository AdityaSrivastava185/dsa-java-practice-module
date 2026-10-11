package inheritance;

public class BoxWeight extends Box{
    int weight;
    public BoxWeight(){
        this.weight = 1;
    }
    BoxWeight(BoxWeight other){
        super(other);
    }
    public BoxWeight(int weight, int l, int h, int w){
       super(l, h, w);
       this.weight = weight;

    }
}
