import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }
    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.print("Enter the root value: ");
        int value = scanner.nextInt();

        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.print(
                "Do you want a left child of " + node.value + "? (true/false): "
        );

        boolean hasLeft = scanner.nextBoolean();

        if (hasLeft) {
            System.out.print("Enter the left child value: ");
            int value = scanner.nextInt();

            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.print(
                "Do you want a right child of " + node.value + "? (true/false): "
        );

        boolean hasRight = scanner.nextBoolean();

        if (hasRight) {
            System.out.print("Enter the right child value: ");
            int value = scanner.nextInt();

            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, 0);
    }

    private void display(Node node, int level) {
        if (node == null) {
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
