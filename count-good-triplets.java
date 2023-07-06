class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                if(Math.abs(arr[i]-arr[j])<=a){
                    for(int k=j+1;k<n;k++){
                    boolean flag= Math.abs(arr[i]-arr[k])<=c && Math.abs(arr[k]-arr[j])<=b;
                    if(flag){
                        count++;
                    }
                    }
                }
                
                
            }
        }
        return count;

      //or
      

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i] - arr[j] <= a && arr[j] - arr[i] <= a)
                {
                for(int k=j+1;k<arr.length;k++)
                {
                if(arr[j] - arr[k] <= b && arr[k] - arr[j] <= b)
                {
                    if(arr[i] - arr[k] <= c && arr[k] - arr[i] <= c)
                    {
                        count++;
                    }
                }
                }
                }
            }
        }
        return count;
    }
}
