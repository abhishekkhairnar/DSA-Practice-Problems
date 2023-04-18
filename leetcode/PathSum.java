import javax.lang.model.util.ElementScanner14;

public class PathSum {
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
        Node root = new Node(5);
        root.left = new Node(4);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        
        root.right = new Node(8);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);
        System.out.println(hasPathSum(root,22));
    }
    public static boolean hasPathSum(Node root, int targetSum) {
        if(root == null) return false;
        change(root);
        if(root.data == targetSum){
            if(root.left != null && root.right != null)
                return true;
            else
                return false;
        }
        boolean ans = find(root,targetSum); 
        return ans;
    }
    public static boolean find(Node root,int target){
        if(root == null) return false;
        if(root.data == target){
            return true;
        }
        boolean left = false,right=false;
        if(root.left != null){
            left = find(root.left,target);
        }
        if(left == false && root.right != null){
            right = find(root.right,target);
        }
        return (left || right);
    }
    public static void change(Node root){
        if(root == null) return;
        if(root.left != null)
            root.left.data = root.data+root.left.data;
        if(root.right != null)
            root.right.data = root.data+root.right.data;
        change(root.left);
        change(root.right);
    }
}
