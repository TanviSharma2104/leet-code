class Solution {
    public int searchB(int[]nums,int start,int end,int target){
            if(start>end){
                return -1;
            }
            int mid=(end+start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[start]<=nums[mid]){//left side is sorted
                if(target>=nums[start] && target<=nums[mid]){
                    return searchB(nums,start,mid-1,target);
                }
                return searchB(nums,mid+1,end,target);

                
            }
            if(target>=nums[mid] && target<=nums[end]){
                return searchB(nums,mid+1,end,target);
            }
        return searchB(nums,start,mid-1,target);

    }
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        return searchB(nums,start,end,target);

        
    }
}
