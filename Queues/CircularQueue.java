package Queues;

public class CircularQueue {
    protected int data[];
    private static final int DEFAULT_SIZE = 10 ;
    protected int end=0;
    protected int front=0;
    private int size=0;
    public CircularQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size)
    {
        this.data = new int[size];
    }
    public boolean isFull()
    {
        return size == data.length -1;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end++]=item;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is full");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public int front()throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is full");
        }
        return data[front];
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }
        int i=front;
        do{
            System.out.print(data[i]+" ");
            i++;
            i = i % data.length;            
        }while(i != end);
        System.out.println("End");
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        try {
            System.out.println(q.remove());
        } catch (Exception e) {
            e.printStackTrace();
        } 
        q.insert(123);
        q.display();
    }
}
