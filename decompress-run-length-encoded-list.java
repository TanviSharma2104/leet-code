class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i=i+2){
            int freq=nums[i];
            int val=nums[i+1];
            while(freq>0){
                li.add(val);
                freq--;
            }
        }

        int[] ans=new int[li.size()];
        for(int i=0;i<li.size();i++){
            ans[i]=li.get(i);
        }
        return ans;
    }
}
