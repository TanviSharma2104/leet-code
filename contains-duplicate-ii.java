class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++){
            //int j=i+1;
            for(int j=i+1;j<nums.length && j<=k+i;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;

//or  
      
      
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<nums.length;i++)
    {
        if(set.contains(nums[i])) return true;
        set.add(nums[i]);
        if(set.size()>k)
            set.remove(nums[i-k]);
    }
    return false;
    }
}
