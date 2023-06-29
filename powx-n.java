class Solution {
    public double myPow(double x, int n) {
        //double pow=x;
        
        if(n==0){
            return 1;
        }
        
       
        if(n<0){
            return 1/x*myPow(1/x,-(n+1));
        }

        return (n%2==0)?myPow(x*x,n/2):x*myPow(x*x,n/2);
        // for(int i=1;i<n;i++){
        //     pow=pow*x;
        // }
        // return pow;
    }
}
