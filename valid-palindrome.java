class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int a=(int)ch;
            //if((a>=65 && a<=91) || (a>=97 && a<=122) || Character.isDigit(ch)){
                if(Character.isLetterOrDigit(ch)){
                s1=s1+""+ch;
            }
        }
        s1=s1.toLowerCase();
        StringBuffer s2=new StringBuffer(s1);
        s2.reverse();
        String s3=s2.toString();
        if(s3.equals(s1)){
            return true;
        }
        return false;
    }
}
