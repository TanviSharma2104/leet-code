class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr =new int[nums.length];
    int[] left =new int[nums.length];
    int sum=1;
     
    for(int i=0;i<nums.length;i++)
    {
        left[i]=sum;
        sum=sum*nums[i];
    }
    int[] right =new int[nums.length];
    sum=1;   
    for(int i=nums.length-1;i>=0;i--)
    {
        right[i]=sum;
        sum=sum*nums[i];
    }   
    for(int i=0;i<nums.length;i++)
    {
        nums[i]=left[i]*right[i];
    }
    return nums;
    }
}
