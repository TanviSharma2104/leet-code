class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n=matrix[0].length;
        int m=matrix.length;
        int row=0;
        int col=n-1;

        while(row<m && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row=row+1;

            }
            else{
                col=col-1;
            }
        }
        return false;
    }
}
