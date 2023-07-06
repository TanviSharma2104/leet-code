class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int lengthOfSmallestSubarray = Integer.MAX_VALUE;
        int windowSum = 0;

        int windowStart = 0;
        for(int windowEnd = 0; windowEnd < n; windowEnd++) {
            windowSum += nums[windowEnd]; 
            while(windowSum >= target) { 
                lengthOfSmallestSubarray = Math.min(lengthOfSmallestSubarray, windowEnd-windowStart+1);
                windowSum -= nums[windowStart]; 
                windowStart++; 
            }
        }

        return lengthOfSmallestSubarray == Integer.MAX_VALUE ? 0 : lengthOfSmallestSubarray;

      //or

      int i; int start=0; int ans=Integer.MAX_VALUE; int sum=0;
        for(i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                ans=Math.min(ans,i-start+1);
                sum-=nums[start++];
            }

        }
        if(ans!=Integer.MAX_VALUE){
            return ans;}
        return 0;
        
    }
}
