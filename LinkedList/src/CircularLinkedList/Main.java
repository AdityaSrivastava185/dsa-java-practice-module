package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insertLast(8);
        list.insertLast(89);
        list.insertLast(2);
        list.insertLast(198);
        list.delete(2);
        list.display();
    }
}
