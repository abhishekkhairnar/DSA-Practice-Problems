package Stacks;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StackDemo
{
    protected int[]data;
    private static final int DEFAULT_SIZE=10;
    int ptr = -1;
    // CONSTRUCTORS
    public StackDemo()
    {
        this(DEFAULT_SIZE);
    }
    public StackDemo(int size)
    {
        this.data = new int[size];
    }
    // FUNCTIONS
    
    // 1) push onto stack
    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws CustomStackException
    {
        if(isEmpty())
        {
            throw new CustomStackException("Cannot pop from an empty stack !!");
        }
        return data[ptr--];
    }
    private boolean isFull() 
    {
        return ptr == data.length - 1;
    }
    private boolean isEmpty()
    {
        return ptr == -1;
    }
    public int peek() throws CustomStackException
    {
        if(isEmpty())
        {
            throw new CustomStackException("Canno peek from an empty stack !!");
        }
        return data[ptr];
    }
}