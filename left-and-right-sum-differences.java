class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans=new int[nums.length];
        int[] leftsum=new int[nums.length];
        int[] rightsum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                leftsum[i]+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                rightsum[i]+=nums[k];
            }
            ans[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return ans;
    }
}
