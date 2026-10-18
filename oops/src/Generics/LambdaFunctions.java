package Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i *2);
        }
        list.forEach((item) -> System.out.print(item * 2));
        System.out.println(list);
    }
}