class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[2*i]=nums[i];
        }
        for(int j=0;j<n;j++){
            ans[2*j+1]=nums[n+j];
        }
        return ans;

    }
}
