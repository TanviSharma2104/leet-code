class Solution {
    public String interpret(String command) {
        String ans="";
        for(int i=0;i<command.length();i++){
            String a=""+command.charAt(i);
            if(a.equals("(")){
                if(command.charAt(i+1)==')'){
                    ans+="o";
                }

            }
            else if(a.equals(")")){
                continue;
            }
            else{
                ans+=a;
            }
        }
        return ans;
    }
}
