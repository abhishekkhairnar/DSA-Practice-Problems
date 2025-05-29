import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SymmetricTree {
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
    public static void main(String[] args) 
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(3);
        root.right.right = new Node(4);
        ArrayList<Integer> l = new ArrayList<>();
        // System.out.println();
        ArrayList<Integer> r = new ArrayList<>();
        preOrder(root.left,l);
        preOrder(root.right,r);
        for(int ele : l){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele : r){
            System.out.print(ele+" ");
        }
        for(int i=0;i<l.size();i++){
            if(l.get(i) != r.get(i)){
                System.out.println("false");
            }
        }
    }
    public static void preOrder(Node root,ArrayList<Integer> list){
        if(root == null) return;
        // System.out.print(root.data);
        list.add(root.data);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
}
