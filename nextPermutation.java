class Solution {
    public static void reverse(int start,int end,int nums[]){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int p=0;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        int q=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[p]<nums[i]){
                q=i;
                break;
            }
        }
        if(p==q){
            reverse(0,n-1,nums);
            return;
        }
        
        int temp=nums[p];
        nums[p]=nums[q];
        nums[q]=temp;
        
        reverse(p+1,nums.length-1,nums);
    

        
        
    }
}
