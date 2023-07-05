class Solution {
    public int longestSubarray(int[] nums) {
        int curr=0,prev=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr++;
            }
            else{
                max=Math.max(max,curr+prev);
                prev=curr;
                curr=0;
            }
        }
         max=Math.max(max,curr+prev);
        return max==nums.length?max-1:max;        
        
    }
}
