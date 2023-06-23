class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sumd=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int a=nums[i];
            int c=0;
            while(a!=0){
                c+=a%10;
                a=a/10;
            }
            sumd+=c;
        }
        return Math.abs(sum-sumd);   
    }
}


// or


class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sumd=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            //int a=nums[i];
            //int c=0;
            while(nums[i]!=0){
                //c+=a%10;
                sumd+=nums[i]%10;
                nums[i]=nums[i]/10;
            }
            //sumd+=c;
        }
        return Math.abs(sum-sumd);   
    }
}
