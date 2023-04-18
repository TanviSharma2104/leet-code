class Solution {
    public void setZeroes(int[][] matrix) {
        int n1=matrix.length;
        int n2=matrix[0].length;
        int arr[][]=new int[n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr[i][j]==0){
                    for(int k=0;k<n1;k++){
                        matrix[k][j]=0;
                    }
                    for(int l=0;l<n2;l++){
                        matrix[i][l]=0;
                    }
                }
            }
        }
        
        
        
        
    }
}
