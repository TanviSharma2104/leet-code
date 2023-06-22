class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],true);
        }
        //Arrays.sort(nums);
        int n=nums.length;
        //int n=nums[nums.length-1];
        for(int i=1;i<=n+1;i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return 1;
    }
}
