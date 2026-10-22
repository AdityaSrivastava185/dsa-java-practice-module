public class BST {
    private static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Insert a value into the BST.
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        // Duplicate values are ignored in this implementation.

        return node;
    }

    // Search for a value.
    public boolean contains(int value) {
        Node current = root;

        while (current != null) {
            if (value == current.value) {
                return true;
            } else if (value < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    // Height convention: null = -1, leaf = 0.
    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }

        return 1 + Math.max(
                height(node.left),
                height(node.right)
        );
    }

    // Check the height-balance condition at every node.
    public boolean isBalanced() {
        return checkHeight(root) != -2;
    }

    private int checkHeight(Node node) {
        if (node == null) {
            return -1;
        }

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -2) {
            return -2;
        }

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -2) {
            return -2;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -2;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Inorder: left, node, right.
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    // Preorder: node, left, right.
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Postorder: left, right, node.
    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }

    // Build a reasonably balanced BST from a sorted array.
    public void populateSorted(int[] nums) {
        root = buildBalanced(nums, 0, nums.length - 1);
    }

    private Node buildBalanced(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        Node node = new Node(nums[mid]);

        node.left = buildBalanced(nums, start, mid - 1);
        node.right = buildBalanced(nums, mid + 1, end);

        return node;
    }

}
