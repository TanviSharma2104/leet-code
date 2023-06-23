class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int c=0;
        for(int i=nums.length-1;i>=2;i--){
            for(int j=i-1;j>=1;j--){
                if(nums[i]-nums[j]==diff){
                    for(int k=j-1;k>=0;k--){
                        if(nums[j]-nums[k]==diff){
                            c++;
                        }
                    }
                }
            }
        }
        return c;
    }
}
