import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SalesMan {
    public static void main(String[] args) {
        int[][]arr=new int[][]{
            {0,0,1},
            {0,2,2},
            {1,3,2}
        };
        // Arrays.sort(arr);
        List<List<Integer>> offers = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(0);
        l.add(1);
        offers.add(l);
        List<Integer> l1 = new ArrayList<>();

        l1.add(0);
        l1.add(2);
        l1.add(2);
        offers.add(l1);
        List<Integer> l2 = new ArrayList<>();

        l2.add(1);
        l2.add(3);
        l2.add(2);

        offers.add(l2);
        System.out.println("Before");
        for(List<Integer>a:offers){
            System.out.println(a.get(0)+" "+a.get(1)+" "+a.get(2));
        }
    
        Collections.sort(offers, new ArrayComparator());
        
        System.out.println("After");
        for(List<Integer>a:offers){
            System.out.println(a.get(0)+" "+a.get(1)+" "+a.get(2));
        }

        boolean[]sold=new boolean[5];
        int profit=0;
        for(List<Integer> list : offers){
            if(!sold[l.get(0)] && !sold[l.get(1)]){
                profit= list.get(2);
                int start = list.get(0)+1;
                int end = list.get(1);
                for(int i=start;i<=end;i++){
                    sold[i]=true;
                }    
                for(int i=0;i<5;i++) System.out.print(sold[i]+" ");
                System.out.println();
            }
        }
        System.out.println("Profit : "+profit);


    }
    public static class ArrayComparator implements Comparator<List<Integer>>{
        public int compare(List<Integer> a1,List<Integer> a2){
            if(a1.get(2) == a2.get(2)){
                if(a1.get(1) == a2.get(1)){
                    if(a1.get(0) == a2.get(0)){
                        return 0;
                    }
                }
            } 
            else if(a1.get(2) < a2.get(2)){
                return 1;
            } 
            else return -1;
        }
    }
}
