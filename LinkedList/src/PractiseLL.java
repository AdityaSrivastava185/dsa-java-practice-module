public class PractiseLL {

    private Node head;
    private Node tail;
    private int size;

    public class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
    public PractiseLL(){
        this.size = 0;
    }

    public int getSize(){
        return size;
    }

    public void insertFirst(int value){
       // create the new node
        Node node = new Node(value);

        // connect the new node with the old head
        node.next = head;

        // update head in the list
        head = node;

        // check if the head is null or not , and if the head is null then assign tail to null
        if(tail == null){
            tail = head;
        }
        size ++ ;
    }

    public void add(int value){
        // create new node
        Node node = new Node(value);
        // check if tail is null
        if(tail == null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size ++;
    }

    public void insertAtIndex(int value, int index){
        // Insert at the beginning
        if (index == 0) {
            insertFirst(value);
            return;
        }

        // Insert at the end
        if (index == size) {
            add(value);
            return;
        }

        // Find the node before the insertion position
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        // Create and connect the new node
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;

        // Update the size
        size++;
    }

    public void display(){
        Node temp = head;
        System.out.println("Displaying the list");
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
