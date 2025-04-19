package Trees;

public class BinarySearchTree {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 3 };
        BinarySearchTree tree = new BinarySearchTree();
        tree.populate(arr);
        tree.display();
        tree.balanced();
        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.InOrder();
        System.out.println();
        tree.postOrder();
    }

    private class Node {
        int value;
        int height;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }

    }

    private int getHeight(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    private Node rootNode;

    public void insert(int value) {
        rootNode = insert(value, rootNode);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(getHeight(node.right), getHeight(node.left)) + 1;
        return node;
    }

    public void balanced() {
        if (balanced(rootNode)) {
            System.out.println("The tree is balanced");
        } else {
            System.out.println("The tree is not balanced");
        }
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left)
                && balanced(node.right);
    }

    public void populate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }

    public void populateSorted(int[] arr) {
        populateSorted(arr, 0, arr.length - 1);
    }

    private void populateSorted(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        this.insert(arr[mid]);
        populateSorted(arr, start, mid);
        populateSorted(arr, mid + 1, end);
    }

    public void display() {
        display(rootNode, "Rootnode: ");
    }

    // traversals
    // N--->L--->R
    public void preOrder() {
        preOrder(rootNode);
    }
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);

    }
    // L--->N--->R
    public void InOrder() {
        InOrder(rootNode);
    }
    private void InOrder(Node node){
        if(node==null){
            return;
        }
        InOrder(node.left);
        System.out.println(node.value);
        InOrder(node.right);
    }

    public void postOrder() {
        postOrder(rootNode);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "The left Node of " + node.value + " is: ");
        display(node.right, "The right Node of " + node.value + " is: ");
    }
}
