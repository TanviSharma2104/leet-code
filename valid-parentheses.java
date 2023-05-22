class Solution {
    public boolean isValid(String s) {

        Stack<String> st=new Stack<>();
        boolean flag=true;
        int n=s.length();
        for(int i=0;i<n;i++){
            String ch=""+s.charAt(i);
            if(ch.equals("(")){
                st.push(")");
            }
            else if(ch.equals("{")){
                st.push("}");
            }
            else if(ch.equals("[")){
                st.push("]");
            }
            
            else if(st.isEmpty() || !st.peek().equals(ch)){
                flag=false;
                break;
            }
            
            else{
                st.pop();
            }
            
            
        }
        
	
        return st.isEmpty()&& flag;
   }
}
