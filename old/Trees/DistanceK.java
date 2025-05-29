public class DistanceK {
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
        printKDist(root, 2);
    }
    public static void printKDist(Node root,int k)
    {
        if(root == null)
            return;
        if(k == 0)
            System.out.println(root.data);
        else
        {
            printKDist(root.left, k-1);
            printKDist(root.right, k-1);
        }
    }
}
