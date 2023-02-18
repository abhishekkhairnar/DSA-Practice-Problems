package Stacks;

public class TwoStacks {
    int[] arr = new int[10];
    int top1=-1;
    int top2=10;
    int p1=0;
    int p2=9;
    public boolean pushIntoStackOne(int val)
    {
        if(top1==-1 && top1 != 9)
        {
            top1++;
            arr[top1] = val;
            return true;
        }
        else
        {
            System.out.println("Stack is full");
            return false;
        }

    }
    public boolean pushIntoStackTwo(int val)
    {
        if(top1 >= top2)
            return false;
        else
        {
            top2--;
            arr[top2] = val;
            return true;
        }
    }
    public static void main(String[] args) {
        
    }
}
