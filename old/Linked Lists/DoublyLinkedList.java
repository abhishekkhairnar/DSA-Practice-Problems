package abhi;

public class DoublyLinkedList 
{
	private Node head;
	private Node tail;
	private int size;
	public void insertFirst(int value){
		Node node = new Node(value);
		node.next = head;
		node.previous = null;
		if(head != null)
			head.previous = node;
		head = node;
		size++;
	}
	public void insertLast(int value) {
		Node node = new Node(value);
		tail.next = node;
		node.previous = tail;
		tail = node;
		size++;
	}
	public void insert(int index,int value) {
		if(index == 0)
		{
			insertFirst(value);
			size++;
			return;
		}
		if(index == size-1)
		{
			insertLast(value);
			size++;
			return;
		}
		Node prev = get(index-1);
		Node node = new Node(value);
		Node next = prev.next;
		node.previous = prev;
		prev.next = node;
		node.next = next;
		next.previous = node;
		size++;
	}
	public void deleteFirst() {
		if(head == null)
			tail = head;
		head = head.next;
		head.previous = null;
		size--;
	}
	public void deleteLast() {
		Node secondlast = get(size-1);
		secondlast.next = null;
		tail.previous = null;
		tail = secondlast;
		size--;
	}
	public void delete(int index) {
		Node prev = get(index-1);
		prev.next = prev.next.next;
		Node next = prev.next;
		next.previous = prev;
		size--;
	}
	public Node get(int index) {
		Node temp = head;
		for(int i=0;i<index;i++)
		{
			temp = temp.next;
		}
		return temp;
	}
	public Node search(int value) {
		Node temp = head;
		while(temp.next != null)
		{
			if(temp.value == value)
			{
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	private class Node
	{
		private int value;
		private Node next;
		private Node previous;
		Node(int value)
		{
			this.value = value;
		}
		Node(int value,Node next,Node previous)
		{
			this.value = value;
			this.next = next;
			this.previous = previous;
		}
	}
}
