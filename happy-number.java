class Solution {
    public int sqdigit(int m){
        int ans=0;
            while(m!=0){
                int d=m%10;
                ans+=d*d;
                m/=10;
            }
            return ans;
    }
    public boolean isHappy(int n) {
        // while(n!=1){
        //     if(n*n<=9){
        //         return false;
        //     }
        //     int m=n;
        //     n=0;
        //     while(m!=0){
        //         int d=m%10;
        //         n+=d*d;
        //         m/=10;
        //     }
        // }
        // return true;
        HashSet<Integer> st=new HashSet<>();
        while(true){
            n=sqdigit(n);
            if(n==1){
                return true;
            }
            if(st.contains(n)){
                return false;
            }
            st.add(n);
        }
    }
}
