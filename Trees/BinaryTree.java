package Trees;

import java.util.Scanner;

public class BinaryTree {
    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int val) {
            this.value = val;
        }
    }

    private Node rootNode;

    private BinaryTree() {

    }

    public void populate(Scanner scanner) {
        System.out.println("Enter the value of the root Node:");
        int value = scanner.nextInt();
        rootNode = new Node(value);
        populate(scanner, rootNode);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you wanna enter Node to the left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value to be add to the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you wanna enter Node to the right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value to be add to the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(rootNode, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(rootNode,0);
    }
    private void prettyDisplay(Node node,int level){
        if(node==null){
            return;
        }
        prettyDisplay(node.right, level+1);
        if(level!=0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("\t");
            }
            System.out.println("|------>"+node.value);
        }
        else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level+1);
        
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        tree.populate(scanner);
        tree.prettyDisplay();
    }

}