class Solution {
    public int mySqrt(int x) {
        
        if(x<2){
            return x;
        }
        int start=1;
        int end=x/2;
        
        while(start<=end){
            //int mid=start+(end-start)/2;
            int mid=(start+end)/2;
            //long  s=mid*mid;
            if((long)mid*mid<=x){
                start=mid+1;;
            }
            else{
                end=mid-1;
            }
            
        }
        return end;
    }
}


// end we have taken x/2, it’s because, square root of any value (excluding 0 and 1), will always been less then or equal to it’s half value,

// Like,

// square root of 4 is 2 which is equal to 4/2.

// square root of 9 is 3 which is less then 9/2.

// square root of 16 is 4, which is less then 16/2 and so on.
