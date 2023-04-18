class Solution {
    public int searchInsert(int[] nums, int target) {

        int i=0;
        int flag=0;
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                i=mid;
                flag=1;
                return i;

            }
            else if(nums[mid]>target){
                e=mid-1;
            

            }
            else if(nums[mid]<target){
                s=mid+1;
                
            }
        }
        
        return e+1;
        
    }
}
