class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean flag = true;
        for(int i = 2; i < n-1; i++){
            //convert to base 
            if(!check(Integer.toString(n,i))){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean check(String n){
        int left = 0;
        int right = n.length()-1;
        while(left<right){
            if(n.charAt(left)!=n.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

  //or

    public boolean isStrictlyPalindromic(int n) {
        return false;
    }


}
