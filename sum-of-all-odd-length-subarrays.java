class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            ans+=arr[i]*(((i+1)*(n-i)+1)/2);
        }
        return ans;
    }
}

//count number of times each elements contributes in ans
