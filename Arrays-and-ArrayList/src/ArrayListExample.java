import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    static void main(String[] args) {
        // syntax - ArrayList<Integer> variable_name = new ArrayList<>();
        // ArrayList is used when the user does not know the actual size of the array
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the size of the list - ");
        int sizeoflist = in.nextInt();

        list.add(76);
        list.add(77);
        list.add(78);
        list.add(79);
        list.add(87);
        list.add(88);
        list.add(89);
        //contains
        System.out.println(list.contains(77));
        // print
        System.out.println(list);
        // set
        list.set(0, 777);
        // remove
        list.remove(2); // it takes the index number of the list
        System.out.println(list);
        //input
        for(int i = 0; i < sizeoflist ; i++){
            list.add(in.nextInt());
        }
        // iterate
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}

