class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //List<Integer> list1=new ArrayList<Integer>();
        List<List<Integer>> list=new ArrayList<>();
        int sum=0;
        for(int i=0;i<nums.length-2;i++){
            
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                        
                            if((nums[i]+nums[j]+nums[k])==0){
                                if(nums[i]>=nums[j] && nums[j]>=nums[k]){
                                if(!list.contains(Arrays.asList(nums[i],nums[j],nums[k])))
                                list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                                }
                                else if(nums[j]>=nums[i] && nums[i]>=nums[k]){
                                    if(!list.contains(Arrays.asList(nums[j],nums[i],nums[k])))
                                list.add(Arrays.asList(nums[j],nums[i],nums[k]));

                                }
                                else if(nums[k]>=nums[i] && nums[i]>=nums[j]){
                                    if(!list.contains(Arrays.asList(nums[k],nums[i],nums[j])))
                                list.add(Arrays.asList(nums[k],nums[i],nums[j]));
                                }
                                else if(nums[i]>=nums[k] && nums[k]>=nums[j]){
                                    if(!list.contains(Arrays.asList(nums[i],nums[k],nums[j])))
                                list.add(Arrays.asList(nums[i],nums[k],nums[j]));
                                }
                                else if(nums[j]>=nums[k] && nums[k]>=nums[i]){
                                    if(!list.contains(Arrays.asList(nums[j],nums[k],nums[i])))
                                list.add(Arrays.asList(nums[j],nums[k],nums[i]));
                                }
                                else if(nums[k]>=nums[j] && nums[j]>=nums[i]){
                                    if(!list.contains(Arrays.asList(nums[k],nums[j],nums[i])))
                                list.add(Arrays.asList(nums[k],nums[j],nums[i]));
                                }
                                // list1.add(nums[i]);
                                // list1.add(nums[j]);
                                // list1.add(nums[k]);                        
                        
                            }
                        }
                
            }
            
        }
        return list;
    }
        
}
