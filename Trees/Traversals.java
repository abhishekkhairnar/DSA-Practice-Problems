import java.util.LinkedList;
import java.util.Queue;
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
        levelOrder2(root);
        spiral(root);
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
    public static void IterativePreorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(s.isEmpty() == false){
            Node curr = s.pop();
            System.out.println(curr.data+" ");
            if(curr.right != null)
            {
                s.push(curr.right);
            }
            if(curr.left != null)
            {
                s.push(curr.left);
            }
        }
    }
    // level order traversal or tree
    public static void levelOrder(Node root)
    {
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size() > 1){
            Node curr = q.poll();
            if(curr == null)
            {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.println(curr.data+" ");
            if(curr.left != null){q.add(curr.left);}
            if(curr.right != null){q.add(curr.right);}
        }
    }
    // print level order using another approach
    public static void levelOrder2(Node root)
    {
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty() == false){
            int count = q.size();
            for(int i=0;i<count;i++)
            {
                Node curr = q.poll();
                System.out.println(curr.data+" ");
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            System.out.println();
        }
    }

    

    // spiral traversal
    public static void spiral(Node root)
    {
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        Stack<Node> s = new Stack<>();
        boolean reverse = false;
        while(q.isEmpty() == false)
        {
            int count = q.size();
            for(int i=0;i<count;i++)
            {
                Node curr = q.poll();
                if(reverse) s.push(curr);
                else System.out.print(curr.data);
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            if(reverse)
            {
                while(q.isEmpty() == false)
                {
                    System.out.print(s.pop()+" ");
                }
            }
            reverse = !reverse;
            System.out.println();
        }
    }
    
}
