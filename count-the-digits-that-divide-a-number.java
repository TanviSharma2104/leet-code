class Solution {
    public int countDigits(int num) {
        int c=0;
        int m=num;
        while(num>0){
            int d=num%10;
            if(m%d==0){
                c++;
            }
            num=num/10;
        }
        return c;
    }
}
