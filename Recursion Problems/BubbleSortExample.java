// public class BubbleSortExample {  
// static void bubbleSort(int[] arr) {  
// int n = arr.length;  
// int temp = 0;  
//     for(int i=0; i < n; i++){  
//             for(int j=1; j < (n-i); j++){  
//                     if(arr[j-1] > arr[j]){  
//                             //swap elements  
//                             temp = arr[j-1];  
//                             arr[j-1] = arr[j];  
//                             arr[j] = temp;  
//                     }  
                    
//             }  
//     }
import java.util.*;
public class BubbleSortExample{
        public static void main(String[]args){
                
        }
        static void bubbleSort(ArrayList<ArrayList<Integer>> list ){
                int n = list.size();
                ArrayList<Integer> temp = new ArrayList<>();
                for(int i=0;i<n;i++){
                        for(int j=1;j<(n-i);j++){
                                if(list.get(j-1).get(j-1) > list.get(j).list.get(j)){
                                        temp = list.get(j-1);
                                        list.set(j-1,list.get(j));
                                        list.set(j,temp);
                                }
                        }
                }
        }
}