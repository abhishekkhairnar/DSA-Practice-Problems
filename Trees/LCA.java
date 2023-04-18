import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LCA {
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
        // Node ans = LCA(root, 30, 80);
        // System.out.println(ans.data);
        List<String> list = new ArrayList<>();
        // buildPath2(root, 30, str);
        System.out.println(buildPath2(root,list,30));
        for(String ele : list){
            System.out.print(ele+" ");
        }
    }
    public static Node lowestCommonAncestor(Node root,int n1,int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        if(buildPath(root,n1,path1) == false || buildPath(root,n2,path2) == false){
            return null;
        }
        for(int i=0;i<path1.size();i++){
            if(path1.get(i+1) != path2.get(i+1)){
                return path1.get(i);
            }
        }
        return null;
    }
    private static boolean buildPath(LCA.Node root, int n1, ArrayList<Node> path1) {
        if(root == null) return false;
        path1.add(root);
        if(root.data == n1) return true;
        if(buildPath(root.left, n1, path1) || buildPath(root.right, n1, path1)){
            return true;
        }
        path1.remove(path1.size()-1);
        return false;
    }
    private static boolean buildPath2(LCA.Node root, List<String> ls,int leaf) {
        if(root == null) return true;
        String str = Integer.toString(root.data);
        ls.add(str);
        if(root.data == leaf){
            return true;
        }
        if(buildPath2(root.left,ls,leaf) || buildPath2(root.right,ls,leaf)){
            return true;
        }
        ls.remove(ls.size()-1);
        return true;
    }
    // efficient solution
    public static Node LCA(Node root,int n1,int n2){
        if(root == null) return null;
        if(root.data == n1 || root.data == n2)
            return root;
        Node left = LCA(root.left,n1,n2);
        Node right = LCA(root.right,n1,n2);
        if(left != null && right != null){
            return root;
        }
        else if(left != null){
            return left;
        }
        else{
            return right;
        }
    }
}
