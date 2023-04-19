class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        while(i>=0 && digits[i]==9){
            i--;
        }
        if(i==-1){
            int[] res=new int [digits.length+1];
            res[0]=1;
            return res;
        }
        int[] res=new int[digits.length];
        res[i]=digits[i]+1;
        for(int j=0;j<i;j++){
            res[j]=digits[j];
        }
        return res;
    }
}
