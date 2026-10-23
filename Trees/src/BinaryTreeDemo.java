import java.util.Scanner;

public class BinaryTreeDemo {
   public class Node{
       private int value;
       private Node left;
       private Node right;

       Node(int value){
           this.value = value;
       }
   }

   private Node root;

   public void populate(Scanner scanner){
       System.out.print("Enter the value of root node = ");
       int value = scanner.nextInt();
       root = new Node(value);
       populate(scanner , root);
   }

   public void populate(Scanner scanner , Node node){
       System.out.println("Do you want to insert the left child of node " + node.value + " (true/false)");
       boolean hasLeft = scanner.nextBoolean();

       if(hasLeft){
           System.out.println("Enter the value of the left child = ");
           int value = scanner.nextInt();
           node.left = new Node(value);
           populate(scanner, node.left);
       }

       System.out.println("Do you want to insert the right child of the node " + node.value + " (true/false)");
       boolean hasRight = scanner.nextBoolean();

       if(hasRight){
           System.out.println("Enter the value of the right child = ");
           int value = scanner.nextInt();
           node.right = new Node(value);
           populate(scanner, node.right);
       }
   }

   public void display(){
       display(root, 0);
   }

   public void display(Node node, int level){
       if(node == null){
           return;
       }

       display(node.right, level + 1);

       for (int i = 0; i < level; i++) {
           System.out.print("    ");
       }

       System.out.println(node.value);

       display(node.left, level + 1);
   }
}
