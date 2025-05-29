// We have to rotate the array d times to left
public class Rotate{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        MoreOptimizedRotate(arr,13);
        printarray(arr);
    }

    // Time Complexity of this solution is O(nd) we can have a optimized solution

    public static void rotateOneTime(int arr[]){
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]= arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

    public static void rotateDtimes(int arr[],int d){
        if(d<arr.length){
            for(int i=0;i<d;i++){
                rotateOneTime(arr);
            }
        }
    }

    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    // Optimized Solution
    // Time Complexity is O(n) & O(d) Auxillary Space
    public static void OptimizedRotate(int arr[],int d){
        int temp[] = {0,0,0,0};

        int len = arr.length;
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int i=d;i<len;i++){
            arr[i-d] = arr[i];
        }
        for(int i=0;i<d;i++){
            arr[len-d+i] = temp[i];
        }
    }

    // More Optimized Algorithm which executes in O(n) time Complexity and O(1) Auxillary Space

    public static void MoreOptimizedRotate(int arr[],int d){ //this algorithm doesnt take any auxillary space
        if(d>arr.length){
            d -= arr.length+1;
        }
        reverse(arr,0,d-1);
        reverse(arr,d,(arr.length-1));
        reverse(arr,0,(arr.length-1));
    }
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}