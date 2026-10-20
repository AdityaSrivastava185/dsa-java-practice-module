package DoubleLinkedList;

public class DoubleLL {
    private Node head;
    private Node tail;
    private int size;

    public class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }
    }
    public void insertFirst(int value){
        Node node = new Node(value);

        node.next = head;

        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " => ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node temp = head;

        if(temp == null){
            System.out.println("END");
            return;
        }

        while (temp.next != null){
            temp = temp.next;
        }

        while(temp != null){
            System.out.print(temp.value + " <= ");
            temp = temp.prev;
        }

        System.out.println("STRAT");
    }

    public void insertLast(int value){
        Node temp = head;
        Node node = new Node(value);

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        node.next = null;
    }

    public void insertAfterNode(int value, int nodeValue){
        Node temp = head;
        Node node = new Node(value);

        while(temp.value != nodeValue){
            temp = temp.next;
        }

       node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        if(node.next != null){
            node.next.prev = node;
        }
    }
}
