import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        StringTokenizer st = new StringTokenizer(s, " ");

		// create ArrayList object
		ArrayList<String> li = new ArrayList<String>();

		// iterate through StringTokenizer tokens
		while(st.hasMoreTokens()) {

			// add tokens to AL
			li.add(st.nextToken());
		}
        if(pattern.length()!=li.size()){
            return false;
        }

        for(int i=0;i<pattern.length();i++){
            char a=pattern.charAt(i);
            String b=li.get(i);
            if(map.containsKey(a)){
                if(!map.get(a).equals(b)){
                    return false;
                }
            }
            else if(!map.containsKey(a) && map.containsValue(b)){
                    return false;
                }
            
            map.put(a,b);
        }
        return true;
    }
}
