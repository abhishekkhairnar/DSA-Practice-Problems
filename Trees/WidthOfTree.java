import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class WidthOfTree {
    HashMap map = new HashMap();
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
        System.out.println(diameter(root));
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
    // width of the tree is the longest path with the maximum number of nodes
    // 1. firstly we will need height function which will calculate height for every node
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        else return 1+ height(root.left) + height(root.right);
    }
    // 2. secondly we will need diameter function this function will return longest path with maximum number of nodes
    public static int diameter(Node root){
        if(root == null) return 0;
        int d1 = 1+height(root.left)+height(root.right);
        int d2 = diameter(root.left);
        int d3 = diameter(root.right);
        return Math.max(d1,Math.max(d2, d3));
    }
    // this function takes O(n^2) time complexity we can do it in O(n) time with O(n) auxillary space
    public static void setHeight(Node root){
        // we will calculate height of every node and store it in hashmap
        if(root == null) return;
        
    }
    // we can optimize the solution by modifying height function 
    int res = 0;
    public int height2(Node root){
        if(root == null) return 0;
        int lh = height2(root.left);
        int rh = height2(root.right);
        res = Math.max(res, 1+lh+rh);
        return 1+Math.max(lh, rh);
    }
}
