class Solution {
    public int diagonalSum(int[][] mat) {
        int ans=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1 || i==j){
                    ans+=mat[i][j];
                }
            }
        }
       

        return ans;
    }
}
