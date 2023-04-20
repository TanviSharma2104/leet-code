public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int c=0;
        // for(int i=0;i<32;i++){
        //     if(((n>>i) & 1)==1)
        //     c++;
        // }
        for(int i=0;i<32;i++){
            int a=n&1;
            if(a!=0){
                c++;
            }
            n=n>>1;
        }
        // while(n!=0){
        //     int a=n&1;
        //     if(a!=0){
        //         c++;
        //     }
        //     n=n>>1;
        //     //n>>=1;
        // }
    
        return c;
    }
}
