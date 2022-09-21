// Leader element of array simply means that element is repeated more than n/2 times in the array
public class LeaderOfArray{
    public static void main(String[]args){
        int[]arr=  {1,2,3,3,3};
        System.out.println(mooresAlgo(arr));
    }
    // This algorithm works in O(n^2 time complexity)
    // Here we will need two for loops in first for loop we will take one element from array and we will check the count of occurance of it if it is greater than n/2 then we will return the index else we will continue to check same for next element 
    public static int leaderofthearray(int[]arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > n/2){
                return i;
            }
        }
        return -1;
    }
    // Moore's voting algorithm
    // This Algorithm works in O(n) time Complexity and takes O(n) Auxillary Space
    // The idea is simple we keep two variables count=1 and result=0 then we traverse through array from index 1 to n-1 and if arr[result] == arr[index] then count++ else count-- after for loop we will check if count == 0 then we will update variables count = 1 & result = index and will again increment the index and check it if it is leader of array
    public static int mooresAlgo(int[]arr){
        int count=1;
        int result=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[result] == arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                result = i;
                count = 1;
            }
        }
        count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == arr[result]){
                count++;
            }
        }
        if(count > n/2){
            return result;
        }
        else
        {
            return -1;
        }
    }
}