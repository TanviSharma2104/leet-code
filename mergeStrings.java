class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int n1=word1.length();
        int n2=word2.length();
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            str+=word1.charAt(i);
            i++;
            str+=word2.charAt(j);
            j++;
        }
        if(i<n1){
            for(int k=i;k<n1;k++){
                str+=word1.charAt(k);
            }
        }
        else if(j<n2){
            for(int l=j;l<n2;l++){
                str+=word2.charAt(l);
            }
        }
        return str;
        
    }
}
//or using StringBuilder 

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder("");
        //String str="";
        int n1=word1.length();
        int n2=word2.length();
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            s.append(word1.charAt(i));
            //str+=word1.charAt(i);
            i++;
            s.append(word2.charAt(j));
            //str+=word2.charAt(j);
            j++;
        }
        if(i<n1){
            for(int k=i;k<n1;k++){
                s.append(word1.charAt(k));
                //str+=word1.charAt(k);
            }
        }
        else if(j<n2){
            for(int l=j;l<n2;l++){
                s.append(word2.charAt(l));
                //str+=word2.charAt(l);
            }
        }
        return s.toString();
        
    }
}
