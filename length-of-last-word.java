class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        String ans="";
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                //ans=ans+""+s.charAt(i);
                c++;
            }else{
                c=0;
                //ans="";
            }
        }
        return c;
      
      //or
        int i=s.length()-1;
        // if(i==0){
        //     return 1;
        // }
        while(i>=0 && s.charAt(i)!=' '){
            c++;
            i--;
        }
        return c;
    }
}
