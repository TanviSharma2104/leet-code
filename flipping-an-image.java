class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans=new int[image.length][image.length];
        for(int i=0;i<image.length;i++){
            for(int j=image[i].length-1;j>=0;j--){
                if(image[i][j]==0){
                    ans[i][image.length-j-1]=1;
                }
                else{
                    ans[i][image.length-j-1]=0;
                }
            }
        }
        return ans;
    }
}
