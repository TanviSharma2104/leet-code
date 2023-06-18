class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        // HashSet<Character> st=new HashSet<>();
        // for(int i=0;i<s.length();i++){
        //     st.add(s.charAt(i));
        // }
        // for(int j=0;j<t.length();j++){
        //     if(!st.contains(t.charAt(j))){
        //         return false;
        //     }
        // }
        // return true;
        char[] s1=s.toCharArray();
        Arrays.sort(s1);
        
        char[] s2=t.toCharArray();
        Arrays.sort(s2);
        
        
        return new String(s1).equals(new String(s2));

    }
}
