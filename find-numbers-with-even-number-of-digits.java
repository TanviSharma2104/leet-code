class Solution {
    public boolean evendigit(int n){
        int d=0;
        while(n>0){
            d++;
            n/=10;
        }
        if(d%2==0){
            return true;
        }
        return false;
    }
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(evendigit(nums[i])){
                c++;
            }
        }
        return c;
    }
}
