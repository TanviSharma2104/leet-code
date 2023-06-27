class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<String,String> map=new HashMap<>();
        char ch='a';
        String ans="";
        for(int i=0;i<key.length();i++){
            String s=""+key.charAt(i);
            if(s.equals(" ")){
                continue;
            }
            if(!map.containsKey(s)){
                map.put(s,""+ch);
                ch++;
            }
            

        }
        for(int j=0;j<message.length();j++){
            String b=""+message.charAt(j);
            if(b.equals(" ")){
                ans+=" ";
            }
            else{
            ans+=""+map.get(b);}
        }

        return ans;

      //or 



        HashMap<Character, Character> table = new HashMap<Character, Character>();
        int ch = 97;

        for (char k : key.toCharArray()) {            
            if (!table.containsKey(k) && k != ' ') {
                table.put(k, (char) ch);
                ch++;
            }
        }

        StringBuilder decode = new StringBuilder();
        for (char k : message.toCharArray()) {
            decode.append(k == ' ' ? ' ' : table.get(k));            
        }

        return decode.toString();
        
    }
}
