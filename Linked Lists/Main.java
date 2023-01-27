// package abhi;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size;
	LinkedList()
	{
		this.size = 0;
	}
	public void insertFirst(int value)
	{
		Node node = new Node(value);
		node.next = head;
		head = node;
		if(tail == null)
		{			
			tail = head;
		}
		size++;
	}
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.value+" -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
		System.out.println("head : "+head.value);
		System.out.println("tail : "+tail.value);
		System.out.println("size : "+size);
	}
	public void insertLast(int value)
	{
		if(tail == null)
		{
			insertFirst(value);
			size++;
		}
		Node node = new Node(value);
		tail.next = node;
		tail = node;
		size++;
	}
	public void insert(int index,int value)
	{
		if(index == 0)
		{
			insertFirst(value);
			size++;
			return;
		}
		if(index == size)
		{
			insertLast(value);
			size++;
			return;
		}
		Node temp = head;
		for(int i=1;i<index;i++)
		{
			temp = temp.next;
		}
		Node node = new Node(value,temp.next);
		temp.next = node;
		size++;
	}
	public void deleteFirst()
	{
		head = head.next;
		if(head == null)
			tail = null;
		size--;
	}
	public void deleteLast()
	{
		if(size <= 1)
		{			
			deleteFirst();
			size--;
			return;
		}
		Node secondlast = get(size-1);
		tail = secondlast;
		secondlast.next = null;
		size--;
	}
	public Node search(int value)
	{
		Node node = head;
		while(node != null)
		{
			if(node.value == value)
			{
				return node;
			}
		}
		return null;
	}
	public Node get(int index)
	{
		Node node = head;
		for(int i=0;i<index;i++)
		{
			node = node.next;
		}
		return node;
	}
	public void delete(int index)
	{
		if(index==0)
			deleteFirst();
		if(index==size-1)
			deleteLast();
		Node prev = get(index-1);
		prev.next = prev.next.next;
		size--;
	}
	private class Node
	{
		private int value;
		private Node next;
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
}
