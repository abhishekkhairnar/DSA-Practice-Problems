public class FractionalKnapsack
{
    public static void main(String[]args)
    {
        
    }
    knapsack(int w,pair<int,int>,arr[],int n)
    {
        sort(arr,arr+n,myCmp);
        double res=0.0;
        for(int i=0;i<n;i++)
        {
            if(arr[i].second <= w)
            {
                res += arr[i].first;
                w -= arr[i].second;
            }
            else
            {
                res+= arr[i].first*((double)w/arr[i].second);
                break;
            }
        }
        return res;
    }
}