class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        for(int i=0;i<address.length();i++){
            String a=""+address.charAt(i);
            if(a.equals(".")){
                ans+="[.]";
            }
            else{
                ans+=a;
            }
        }
        return ans;
    }
}
