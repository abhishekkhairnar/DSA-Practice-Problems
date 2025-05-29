package Queues;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue()
    {
        super();
    }
    public DynamicQueue(int size)
    {
        super(size);
    }

    public boolean insert(int item)
    {
        if(isFull())
        {
            // double the size of array
            int temp[] = new int[data.length * 2];
            // copying all of the existing elements into the newly created array
            for(int i=0;i<data.length;i++)
            {
                temp[i] = data[(front + i) % data.length];
            }
            // making the newly created array our queue
            front=0;
            end=data.length;
            data = temp;
        }
        return super.insert(item);
    }
    public static void main(String[] args) {
        
    }

}
