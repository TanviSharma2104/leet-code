class Solution {
    public int[][] transpose(int[][] matrix) {
        int n1=matrix.length;
        int n2=matrix[0].length;
        int [][] arr=new int[n2][n1];
        for(int i=0;i<n2;i++){
            for(int j=0;j<n1;j++){
                arr[i][j]=matrix[j][i];
            }

        }
        return arr;
        
    }
}
