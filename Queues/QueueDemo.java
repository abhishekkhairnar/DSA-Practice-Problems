package Queues;
import java.util.*;
public class QueueDemo {

    private int data[];
    private static final int DEFAULT_SIZE = 10 ;
    int end=0;
    public QueueDemo()
    {
        this(DEFAULT_SIZE);
    }
    public QueueDemo(int size)
    {
        this.data = new int[size];
    }
    public boolean isFull()
    {
        return end == data.length -1;
    }
    public boolean isEmpty()
    {
        return end == 0;
    }
    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end++]=item;
        return true;
    }
    public int remove() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is full");
        }
        int removed = data[0];
        // after removing one element from start of queue shift all of the elements on right of it to left of it by one potition
        for(int i=1;i<end;i++)
        {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front()throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is full");
        }
        return data[0];
    }
    public void display()
    {
        for (int i = 0; i <= end; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        QueueDemo q = new QueueDemo(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        
        try {
            System.out.println(q.remove());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        q.display();
    }
}