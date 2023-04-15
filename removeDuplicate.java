class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n-k;j++){
                if(nums[i]==nums[j]){
                    
                    for(int l=j;l<n-k-1;l++){
                        nums[l]=nums[l+1];
                    }
                    k++;
                    j--;
                }
            }
        }
        return n-k;
        
    }
}
