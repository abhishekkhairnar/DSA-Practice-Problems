//given an array of positive integers having duplicate elements you have to find an element which doesnt have its duplicate in array
public class Array1{
    public static void main(String[]args){
        int[] arr = {2,3,4,3,2,6,4};
        System.out.print(unique(arr));
    }
    public static int unique(int[] arr){
        int unique=0;
        for(int i:arr){
            unique ^= i;
        }
        return unique;
    }
}