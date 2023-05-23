class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){//true
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{//false
                map.put(nums[i], 1);
            }
        }
        int ans=0;
        for(int key:map.keySet()){
            if(map.get(key)>n/2){
                ans=key;
            }
        }
        return ans;
    }
}
