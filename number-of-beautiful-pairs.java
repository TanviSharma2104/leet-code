class Solution {
    public int gcd(int a,int b){
        
        if(b==0){
            return a;
        }
        return gcd(b,Math.abs(a-b));
    }
    public int countBeautifulPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            int first=nums[i];
            while(first>9){
                first=first/10;
            }
            for(int j=i+1;j<nums.length;j++){
                if(gcd(first,nums[j]%10)==1){
                    c++;
                }
            }
        }
        return c;
    }
}
