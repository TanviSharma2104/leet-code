class Solution {
    public int xorOperation(int n, int start) {
        int[] nums=new int[n];
        int ans=start;
        nums[0]=start;
        for(int i=1;i<n;i++){
            nums[i]=start+2*i;
            ans=ans^nums[i];
        }
        return ans;

    }
}
