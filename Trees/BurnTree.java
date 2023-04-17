public class BurnTree {
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
        Node root = new Node(10);
        root.left = new Node(50);
        root.right = new Node(60);
        root.left.left = new Node(70);
        root.left.right = new Node(20);
        root.left.left.left = new Node(40);
        root.left.right.left = new Node(90);
        root.left.right.right = new Node(80);
        root.left.right.left.left = new Node(30);
        
    }
    static int res = 0;
    class Distance{
        int val;
        Distance(int d){
            val = d;
        }
    }
    public static int burnTree(Node root,int leaf,Distance dist){
        if(root == null) return 0;
        if(root.data == leaf) {
            dist.val = 0;
            return 1;
        }
        Distance ldist = new Distance(-1) , rdist = new Distance(-1);
        int lh = burnTree(root.left, leaf, ldist);
        int rh = burnTree(root.right, leaf, rdist);
        if(ldist.val != -1){
            dist.val = ldist.val + 1;
            res = Math.max(res,rh + dist.val);
        }
        else if(rdist.val != -1){
            dist.val = rdist.val + 1;
            res = Math.max(res, lh + dist.val);
        }
        return Math.max(lh , rh) + 1;
    }
}
