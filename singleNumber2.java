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
        //or

         int o=0;
        int t=0;
        for(int i=0;i<nums.length;i++)
        {
            o=(nums[i]^o)&~t;
            t=(nums[i]^t)&~o;
        }
        return o;
    }
}
