import java.util.LinkedList;

public class Main{
//    public static class Node {
//        int value;
//        Node next;
//        Node(int value){
//            this.value = value;
//        }
//    }
    public static void main(String[] args) {
        System.out.println("Hello World");
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(39);

        // LL class ==================
        LL list = new LL();
        list.insertFirst(34);
        list.insertFirst(14);
        list.insertFirst(24);
        list.insertFirst(64);
        list.insertLast(99);
        list.insertAtIndex(100, 3);
        list.deleteFirst();
        list.display();
        //===========================

        // create the nodes
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);

        // connect the node
        first.next = second;
        second.next = third;

        // mark the head and tail
        Node head = first;
        Node tail = third;
        System.out.println("Head: " + head.value);
        System.out.println("Tail: " + tail.value);

        // iterate over the list
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "=>");
            temp = temp.next;
        }
        System.out.println("null");
    }
}