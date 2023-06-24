class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int c=0;
        for(int i=0;i<words.length;i++){
            int c1=0;
            for(int j=0;j<words[i].length();j++){
                if(set.contains(words[i].charAt(j))){
                    c1++;
                }else{
                    break;
                }
            }
            if(c1==words[i].length()){
                c++;
            }

        }
        return c;
    }
}
