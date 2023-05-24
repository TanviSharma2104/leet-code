class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c=0;
        for(List<String> i:items){
            if(ruleKey.equals("type") && ruleValue.equals(i.get(0))){
                c++;
            }
            else if(ruleKey.equals("color") && ruleValue.equals(i.get(1))){
                c++;
            }
            else if(ruleKey.equals("name") && ruleValue.equals(i.get(2))){
                c++;
            }
        }
        return c;
    }
}
