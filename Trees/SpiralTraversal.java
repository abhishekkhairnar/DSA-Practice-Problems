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
        printSpiral(root);
    }
    public static void printSpiral(Node root){
        Stack<Node> st = new Stack<>();
        Queue<Node> qu = new LinkedList<>();
        boolean reverse = false;
        qu.add(root);
        while(qu.isEmpty() == false){
            int count = qu.size();
            for(int i=0;i<count;i++){
                Node curr = qu.poll();
                if(reverse){
                    st.push(curr);
                }
                else{
                    System.out.print(curr.data+" ");
                }
                if(curr.left != null)  qu.add(curr.left);
                if(curr.right != null)  qu.add(curr.right);
            }
            if(reverse){
                while(st.isEmpty() == false){
                    System.out.print(st.pop().data+" ");
                }
            }   
            reverse = !reverse;
            System.out.println();
        }
    }
    

}
