class Solution {
    public boolean isPalindrome(int n) {
        if(n<0){
            return false;
        }
        int a=0;
        
        
        int d=0;
        int x=n;
        
        
        while(n>0){
            d=n%10;
            
            a=a*10+d;
            n=n/10;
        }
        return (x==a?true:false);
    }
}
