class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int c=0;
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            String code="";
            for(int j=0;j<word.length();j++){
                int index=(int)('a'-word.charAt(j));
                code+=""+arr[Math.abs(index)];
            }
            set.add(code);
        }
        return set.size();
    }
}
