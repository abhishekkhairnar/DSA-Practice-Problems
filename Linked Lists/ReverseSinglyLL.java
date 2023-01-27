
public class ReverseSinglyLL
{
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static void main(String[]args)
    {
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        // printlist(recRev(head));
        printlist(head);

    }
    public static void printlist(Node head)
    {
        Node curr = head;
        while(curr.next!=null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;   
        }
    }
    // Recursive Linear Search
    public static int Linearsearch(Node head,int x)
    {
        if(head == null)    
            return -1;
        if(head.data == x)
            return 1;
        else
        {
            int res = Linearsearch(head.next,x);
            if(res==-1)
                return -1;
            else    
                return res+1;
        }
    }
    public static int printMiddle(Node head)
    {
        int count=0;
        if(head == null)
            return -1;
        Node curr = head;
        while(curr!=null)
        {
            count++;
            curr = curr.next;
        }
        curr = head;
        while(count!=0)
        {
            curr = curr.next;
            count--;
        }
        return curr.data;
    }
    public static int slowfast(Node head)
    {
        if(head == null)
            return -1;
        Node slow = head;
        Node fast = head;
        while(fast!=null || fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }    
        return slow.data;
    }
    // Get nth element from last
    public static int firstSecond(Node head,int n)
    {
        if(head == null)
            return -1;
        Node first = head;
        Node second = head;
        while(n!=0)
        {
            first = first.next;
            n--;
        }
        while(first!=null || first.next!=null)
        {
            first = first.next;
            second = second.next;
        }
        return second.data;
    }
    public static Node ReverseSLL(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
    public static Node recRev(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node restHead = recRev(head.next);
        Node restTail = head.next;
        restTail.next = head;
        head.next = null;
        return restHead;
    }
    public static Node recRev2(Node head)
    {
        Node curr = head;
        while(curr!=null || curr.next!=null)
        {
            if(curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return curr;
    }
}