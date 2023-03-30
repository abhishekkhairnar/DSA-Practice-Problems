import java.util.LinkedList;
import java.util.Queue;

public class WidthOfTree {
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
        System.out.println(widthOfTree(root));
    }
    // Width of the tree is the maximum number of nodes on any level of the tree
    private static int widthOfTree(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int count = q.size();
        while(q.isEmpty() == false)
        {
            count = Math.max(count, q.size());
            for(int i=0;i<count; i++)
            {
                Node curr = q.poll();
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        return count;
    }
}
