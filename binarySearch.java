class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int flag=0;
        int i=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                
                i=mid;
                flag=1;
                break;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else if (target<nums[mid]){
                end=mid-1;
            }
        
        }
        if(flag==0){
            i=-1;
        }
        return i;
    }
}
