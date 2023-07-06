//import java.util.StringBuilder;
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                StringBuffer sb=new StringBuffer(words[i]);
                sb.reverse();
                String s=sb.toString();
                if(s.equals(words[j])){
                    c++;
                    break;
                }
            }
        }
        return c;
      //optimised approach
      int count = 0;
        HashSet<String> set = new HashSet<>();
        
        for (String word : words) {
            String reverse = new StringBuilder(word).reverse().toString();
            if (set.contains(reverse)) {
                count++;
                set.remove(reverse);
            } else {
                set.add(word);
            }
        }
        
        return count;
        
    }
}
