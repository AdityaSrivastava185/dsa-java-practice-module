import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        BinaryTreeDemo node = new BinaryTreeDemo();
        Scanner scanner = new Scanner(System.in);

        node.populate(scanner);
        System.out.println("Node display");

        node.display();
        scanner.close();
//
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//
//        System.out.println("\nTree display (sideways):");
//        tree.display();
//
//        scanner.close();

//        BST tree = new BST();
//
//        int[] values = {15, 8, 22, 4, 12, 18, 30};
//
//        for (int value : values) {
//            tree.insert(value);
//        }
//
//        System.out.print("Inorder:   ");
//        tree.inorder();
//
//        System.out.print("Preorder:  ");
//        tree.preorder();
//
//        System.out.print("Postorder: ");
//        tree.postorder();
//
//        System.out.println("Contains 18: " + tree.contains(18));
//        System.out.println("Contains 99: " + tree.contains(99));
//        System.out.println("Height: " + tree.height());
//        System.out.println("Balanced: " + tree.isBalanced());
//
//        BST balancedTree = new BST();
//        int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        balancedTree.populateSorted(sorted);
//
//        System.out.println(
//                "Balanced tree height: " + balancedTree.height()
//        );
//        System.out.println("Balanced tree inorder:");
//        balancedTree.inorder();


    }
}