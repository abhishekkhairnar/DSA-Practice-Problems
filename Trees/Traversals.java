import java.util.Stack;

public class Traversals {
    private static class Node
    {
        private int data;
        private Node left;
        private Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) 
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);
        // root.left.left.left = new Node(8);
        // root.left.left.left = new Node(9);
        // System.out.println("inorder: ");
        // inOrder(root);
        // System.out.println("\npreorder: ");
        // preOrder(root);
        // System.out.println("\npostorder: ");
        // postOrder(root);
        // System.out.println(getMax(root));
        // System.out.println(getHeight(root));
        IterativeInorder(root);
    }

    // Recursive Approach
    public static void preOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }
    public static void postOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }
    public static int getMax(Node root)
    {
        if(root == null)
        {
            return Integer.MIN_VALUE;
        }
        else
        {
            return Math.max(getMax(root.left),Math.max(getMax(root.right),root.data));
        }
    }
    public static int getHeight(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            return Math.max(getHeight(root.left),getHeight(root.right)) + 1 ;
        }
    }

    // Iterative Approach
    public static void IterativeInorder(Node root)
    {
        Stack<Node> s = new Stack<>();
        Node curr = root;
        while(s.isEmpty() == false || curr != null)
        {
            while(curr != null)
            {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.data+" ");
            curr = curr.right;
        } 
    }
}
