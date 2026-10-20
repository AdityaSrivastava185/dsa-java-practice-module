package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLL list = new DoubleLL();
        DoubleLL list2 = new DoubleLL();
        list.insertFirst(22);
        list.insertFirst(45);
        list.insertFirst(24);
        list.insertFirst(65);
        list.insertFirst(23);
        list.insertLast(35);
        list.insertAfterNode(17, 45);
        list.insertLast(12);
        list.display();
        System.out.println("Reverse Display");
        list.displayReverse();
    }
}
