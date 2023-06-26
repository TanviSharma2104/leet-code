class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<4){
            return 0;
        }
        int x=nums[0];
        int y=nums[1];
        int z=nums[nums.length-1];
        int a=nums[nums.length-2];
        int ans=(a*z)-(x*y);
        return ans;
    }
}
