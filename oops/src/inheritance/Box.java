package inheritance;

public class Box {
    int h;
    int l;
    int w;
    Box(){
        this.h = 1;
        this.l = 1;
        this.w = 1;
    }

    Box(int l, int h, int w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(int side){
        this.w = side;
        this.l = side;
        this.h = side;
    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    public void information(){
        System.out.println("Box");
    }

}
