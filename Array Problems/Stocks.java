// In this program we have to determine the maximum profit user can get ups and downs of prices of stock is given in array
public class Stocks{
    public static void main(String[] args){
        int arr[] ={1,5,3,7,8,12};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int arr[]){
        int n = arr.length;
        int profit = 0;
        for(int i=1;i<n;i++){
            if(arr[i] > arr[i-1]){
                profit += (arr[i] - arr[i-1]);
            }
        }
        return profit;
    }
}