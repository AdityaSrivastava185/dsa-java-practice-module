package Generics;

import java.util.Arrays;
import java.util.List;

public class WildCardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    // size is also working as the index value
    private int size = 0;

    public WildCardExample(){
        data = new  Object[DEFAULT_SIZE];
    }
    // this will only take number
    public void getlist(List Number){
        // do something
        // here you can only give Numbers
    }
    // if want to give the subclass of the number then we can do something like this
    public void getList(List <? extends Number> list){
        //do something
        // now the user can give the subclass of the number
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    private boolean isFull(){
        return size == data.length;
    }
    private void resize(){
        Object[] temp = new Object[data.length * 2];
        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T) (data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }
    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    static void main(String[] args) {
        WildCardExample<Integer> list = new WildCardExample<>();
        // this will show error because we can only add the Number type or the subclass of Number
//        WildCardExample<String> list2 = new WildCardExample<>();
        list.add(29);
        System.out.println(list);
    }
}
