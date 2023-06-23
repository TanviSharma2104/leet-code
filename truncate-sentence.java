import java.util.StringTokenizer;  
class Solution {
    public String truncateSentence(String s, int k) {
        StringTokenizer st=new StringTokenizer(s);
        ArrayList<String> li=new ArrayList<>();
        li.add(st.nextToken());
        while(st.hasMoreTokens()){
            li.add(" "+st.nextToken());
        }
        String ans="";
        for(int i=0;i<k;i++){
            ans=ans+""+li.get(i);
        }
        return ans;

      // or
      
        int wc=0;
        int index=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                wc++;
                if(wc==k){
                    index=i;
                    break;
                }
            }
        }
        if(wc<k){
            index=s.length();
        }
        return s.substring(0,index);
    }
}
