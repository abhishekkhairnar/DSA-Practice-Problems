public class LinkedList
{
    private Node head;
    private Node tail;
    private int size;
    public LinkedList()
    {
        this.size=0;
    }
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null)
            tail = head;
        size++;
    }
    public void display(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
    }
    private class Node
    {
        private int value;
        private Node next;
    }
    Node(int value)
    {
        this.value = value;
    }
    Node(int value,Node next)
    {
        this.value = value;
        this.next = next;
    }
}
