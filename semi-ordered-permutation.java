class Solution {
    public int semiOrderedPermutation(int[] nums) {
        if(nums[0]==1 && nums[nums.length-1]==nums.length){
            return 0;
        }
        int index1=-1;
        int indexN=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                index1=i;
            }
            else if(nums[i]==nums.length){
                indexN=i;
            }
        }
        return index1+(nums.length-1-indexN)-(index1 > indexN ? 1 : 0);
    }
}
