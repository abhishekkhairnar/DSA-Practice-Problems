import javax.swing.event.RowSorterListener;

public class NoOfNodesInBBT{
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
        root.right.right.right = new Node(9);
        root.right.right.left = new Node(10);
        System.out.println(noOfNodes(root));
    }
    public static int noOfNodes(Node root){
        if(root == null) return 0;
        Node curr = root;
        int left = 0;
        int right = 0;
        while(curr != null){
            left++;
            curr = curr.left;
        }
        curr = root;
        while(curr != null){
            right++;
            curr = curr.right;
        }
        if(left == right) return (int) Math.pow(2, left) - 1;
        else{
            return 1 + noOfNodes(root.left) + noOfNodes(root.right);
        }
    }
}