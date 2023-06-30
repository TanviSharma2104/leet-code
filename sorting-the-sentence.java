import java.util.StringTokenizer;
class Solution {
    public String sortSentence(String s) {


         HashMap<Integer, String> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String a = st.nextToken();
            int b = Integer.parseInt(a.substring(a.length() - 1));
            a = a.substring(0, a.length() - 1);
            map.put(b, a);
        }
        int i = 1;
        String ans = "";
        while (map.containsKey(i)) {
            ans += map.get(i);
            if (map.containsKey(i + 1)) {
                ans += " ";
            }
            i++;
        }
        return ans;
///or alternative approch

        String[] st = s.split(" ");
        String[] sortedSt = new String[st.length];
        for (String word : st) {
            int index = word.charAt(word.length() - 1) - '0';
            sortedSt[index - 1] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", sortedSt);
        
    }
}
