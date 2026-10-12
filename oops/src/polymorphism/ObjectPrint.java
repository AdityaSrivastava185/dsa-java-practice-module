package polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num){
        this.num = num;
    }

    static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(12);
        System.out.println(obj.num);
    }
}
