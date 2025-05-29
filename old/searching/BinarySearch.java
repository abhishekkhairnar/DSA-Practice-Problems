import java.util.Scanner;

public class BinarySearch{
    public static void main(String[]args){
        int[]arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers : ");
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        int key=0;
        System.out.println("Enter key you want to search : ");
        key = sc.nextInt();
        System.out.println(binarysearch(arr,key));
    }
    public static int binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<end){
            if(arr[mid]>target){
                end = mid-1; 
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}