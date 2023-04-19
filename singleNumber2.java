class Solution {
    public int[] singleNumber(int[] nums) {
        int a=0;
        
        
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(j==i){
                    continue;
                }
                else if(nums[i]==nums[j]){
                    c++;

                }
            }
            if(c==0){
                a=nums[i];
                break;
                
            }
        }
        return a;
        
    }
}
