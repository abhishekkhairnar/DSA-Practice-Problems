public class Balanced {
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
        System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(Node root)
    {
        if(root == null) return true;
        int lh = height(root.left);
        int rh = height(root.right);
        return (Math.abs(lh-rh) <= 1 && isBalanced(root.left) && isBalanced(root.right));
    }
    private static int height(Node root) {
        if(root == null)
        {
            return 0;
        }
        else
        {
            return Math.max(height(root.left),height(root.right)) + 1 ;
        }
    }
}
