package BinaryTrees;
import java.util.Scanner;

public class BinaryTree{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        tree.populate(sc);
        tree.display();
    }
    public BinaryTree() {
        
    }

    private static class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;
    private int COUNT = 10;
    // insert elements
    public void populate(Scanner sc){
        System.out.println("Enter the root Node : ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }
    public void populate(Scanner sc,Node node){
        System.out.println("do you want to enter left of "+node.value);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the value of left of "+node.value);
            node.left = new Node(sc.nextInt());
            populate(sc,node.left);
        }
        System.out.println("do you want to enter right of "+node.value);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the value of right of "+node.value);
            node.right = new Node(sc.nextInt());
            populate(sc,node.right);
        }
    }

    public void display(){
        print(root,0);
    }

    public void print(Node root,int space){
        if (root == null)
            return;
        space += COUNT;
        print(root.right, space);
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.value + "\n");
        print(root.left, space);
    }
}