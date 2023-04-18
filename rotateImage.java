class Solution {
    public void rotate(int[][] matrix) {
        int n1=matrix.length;
        int[][] arr=new int[n1][n1];
        for(int i=0;i<n1;i++){
            int b=0;
            for(int j=n1-1;j>=0;j--){
                arr[i][b]=matrix[j][i];
                //System.out.print(arr[i][b]+" ");
                b++;
            }
        }
        
        for(int l=0;l<n1;l++){
            for(int k=0;k<n1;k++){
                matrix[l][k]=arr[l][k];
            }
            
        }
        //System.out.print(Arrays.deepToString(arr));
        
    }
}
