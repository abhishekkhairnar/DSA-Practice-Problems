public class ChildrenSum {
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
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        System.out.println(childrenSum(root));
    }
    // Children sum property
    // This property states that tree follows the children sum property if the sum of values of left child and right child is equal to the value of Node
    public static boolean childrenSum(Node root)
    {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        int sum=0;
        if(root.left != null) sum += root.left.data;
        if(root.right != null) sum += root.right.data;
        return (
            root.data == sum 
            && childrenSum(root.left) 
            && childrenSum(root.right)
        );
    }
}
