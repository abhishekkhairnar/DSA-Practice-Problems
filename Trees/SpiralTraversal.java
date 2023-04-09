import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SpiralTraversal {
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
        spiral(root);
    }
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
