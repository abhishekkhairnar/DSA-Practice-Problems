import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
    static int maxLevel = 0;
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
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);
        printIteratively(root);
    }

    public static void printLeftView(Node root,int level)
    {
        if(root == null) return;
        if(maxLevel < level){
            System.out.println(root.data);
            maxLevel = level;
        }
        printLeftView(root.left, level+1);
        printLeftView(root.right, level+1);
    }
    public static void printleft(Node root)
    {
        printLeftView(root, 1);
    }
    // Iterative solution
    public static void printIteratively(Node root)
    {
        if(root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.isEmpty() == false)
        {
            int count = q.size();
            for(int i = 0; i < count; i++){
                Node curr = q.poll();
                if(i == 0)
                    System.out.println(curr.data);
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
    }
}
