package Queues;
import java.util.Deque;
import java.util.LinkedList;
public class PrintMaxProblem {
    public static void main(String[] args) {
        int[]arr={10,8,5,12,15,7,6};
        int k=3;
        maxsubArray(arr,k);
    }

    private static void maxsubArray(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();
        // handling the first window
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty() && arr[i] >= dq.getLast())
                dq.pollLast();
            dq.offerLast(arr[i]);
        }
        // handling remaining elements
        for(int i=k;i<arr.length;i++)
        {
            System.out.print(arr[dq.peekFirst()]+" ");
            while(!dq.isEmpty() && arr[i] >= dq.getFirst())
                dq.pollFirst();
            while(!dq.isEmpty() && arr[i] <= dq.getLast())
                dq.pollLast();
            dq.offerLast(arr[i]);
        }
        System.out.print(arr[dq.peekFirst()]+" ");
    }
}
