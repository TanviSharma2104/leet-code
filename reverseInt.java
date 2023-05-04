class Solution {
    public int reverse(int x) {
        long a=0;
        
        int flag1=0;
        int d;
        
        boolean flag=false;
        if(x<0){
            flag=true;
            x=-x;
        }
        while(x>0){
            d=x%10;
            // if(d==0 && flag1==0){
            //     x=x/10;
            //     continue;
            // }
            // flag1=1;
            a=a*10+d;
            x=x/10;
        }
        if (a > Integer.MAX_VALUE) {
            return 0;
        }
        
        
        return (int)(flag?-a:a);
    }
}
