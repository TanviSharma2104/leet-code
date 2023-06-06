class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+max;
            max++;
        }
        return sum;
    }
}
