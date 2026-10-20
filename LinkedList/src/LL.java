public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size = size + 1;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
    }

    public void insertAtIndex(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size ++;
    }

    public void deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
    }

    public void deleteLast(){

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }
}
