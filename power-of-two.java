class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0){
            return false;
        }
        int c=0;
        while(n!=0){
            int temp=n&1;
            if(temp==1){
                c++;
            }
            n=n>>1;
        }
        if(c==1){
            return true;
        }
        return false;
    }

}
