class Solution {
    public int numberOfMatches(int n) {
        int ans=0;
        int teams=n;
        int matches=0;
        int teamsadv=0;
        while(teams>=2){
            if(teams%2==0){
                matches=teams/2;
                teamsadv=teams/2;
            }else{
                matches=(teams-1)/2;
                teamsadv=(teams-1)/2+1;
            }
            ans+=matches;
            teams=teamsadv;
        }
        return ans;
    }
}
