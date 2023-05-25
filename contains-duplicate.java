class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        boolean flag=false;
        for(int key:map.keySet()){
            if(map.get(key)>=2){
                flag=true;
                break;
            }
        }
        return flag;
    }
}

//or using hash set

HashSet<Integer> set=new HashSet<>();
        for(int a:nums){
            if(set.contains(a)){
                return true;
            }
            else{
                set.add(a);
            }
        }
        return false;
