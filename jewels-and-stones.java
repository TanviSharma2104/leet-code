class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        for(int i=0;i<jewels.length();i++){
            String s1=""+jewels.charAt(i);
            for(int j=0;j<stones.length();j++){
                String s2=""+stones.charAt(j);
                if(s1.equals(s2)){
                    c++;
                }
            }
        }
        return c;
    }
}
