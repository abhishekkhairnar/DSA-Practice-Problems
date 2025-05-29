public class TreeToDLinkedList {
    static Node prev = null;
    static final int COUNT = 10;
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
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);
        // root.right.right.right = new Node(9);
        int in[] = {40,20,60,50,70,10,80,100,30};
        int pre[] ={10,20,30,40,50,60,70,80,90,100};

        // Node ans = BTTODLL(root)
        Node root = buildTree(in, pre, 0, in.length - 1);
        print2DUtil(root,0);
        // System.out.println(root.data);
        print2DUtil(root, 0);
        // printDLL(ans);
    }
    public static void printDLL(Node root)
    {
        while(root != null)
        {
            System.out.println(root.data);
            root = root.right;
        }
    }
    public static Node BTTODLL(Node root)
    {
        // inorder traversal
        if(root == null)
            return root;
        Node head = BTTODLL(root.left);
        if(prev == null) head = root;
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        BTTODLL(root.right);
        return head;
    }
    // Construct a binary tree from inorder traversal and preorder traversal
    static int preIndex=0;
    public static Node cTree(int pre[],int in[],int is,int ie){
        if(is > ie) return null;
        Node root = new Node(pre[preIndex++]);
        
        if(is == ie)
            return root;
        int inIndex=0;
        for(int i=is;i<ie;i++){
            if(in[i] == root.data){
                inIndex = i;
                break;
            }
        }
        root.left = cTree(pre, in, is, inIndex+1);
        root.right = cTree(pre, in, inIndex+1, ie);
        return root;
    } 
    static void print2DUtil(Node root, int space)
    {
        if (root == null)
            return;
        space += COUNT;
        print2DUtil(root.right, space);
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.data + "\n");
        print2DUtil(root.left, space);
    }
    public static Node buildTree(int in[], int pre[], int inStrt, int inEnd)
    {
        if (inStrt > inEnd)
            return null;
 
        /* Pick current node from Preorder traversal using preIndex
           and increment preIndex */
        Node tNode = new Node(pre[preIndex++]);
 
        /* If this node has no children then return */
        if (inStrt == inEnd)
            return tNode;
 
        /* Else find the index of this node in Inorder traversal */
        int inIndex = search(in, inStrt, inEnd, tNode.data);
 
        /* Using index in Inorder traversal, construct left and
           right subtress */
        tNode.left = buildTree(in, pre, inStrt, inIndex - 1);
        tNode.right = buildTree(in, pre, inIndex + 1, inEnd);
 
        return tNode;
    }
 
    /* UTILITY FUNCTIONS */
 
    /* Function to find index of value in arr[start...end]
     The function assumes that value is present in in[] */
    public static int search(int arr[], int strt, int end, int value)
    {
        int i;
        for (i = strt; i <= end; i++) {
            if (arr[i] == value)
                return i;
        }
        return i;
    }
 
    /* This function is here just to test buildTree() */
    void printInorder(Node node)
    {
        if (node == null)
            return;
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        System.out.print(node.data + " ");
 
        /* now recur on right child */
        printInorder(node.right);
    }
}
