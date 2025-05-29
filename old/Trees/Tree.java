public class Tree
{
    static class Node
    {
        private int data;
        public Node left;
        public Node right;
        Node()
        {
            this.left = null;
            this.right = null;
        }
    }
    public static void printTree(Node head)
    {
        System.out.println("\t"+head.data);
        System.out.println("/\t\\");
        System.out.println(head.left.data+"\t\t"+head.right.data);
    }
    public static void main(String[] args) 
    {
        Node head = new Node();
        head.data = 1;
        Node left = new Node();
        left.data = 2;
        head.left = left;
        Node right = new Node();
        right.data = 3;
        head.right = right;
        printTree(head);
    }
}