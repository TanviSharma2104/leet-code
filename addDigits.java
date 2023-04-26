class Solution {
    public int addDigits(int num) {
        int c=0;
        int n=0;
        int d=0;
        int sum=0;
        if(num==0){
            sum=0;
        }
        else{
        while(num!=0){
            d=num%10;
            c++;
            sum+=d;
            num/=10;

        }
        while(c!=1){
            n=sum;
            c=0;
            sum=0;
            while(n!=0){
            d=n%10;
            c++;
            sum+=d;
            n/=10;

        }

        }}
        return sum;
    }
}
