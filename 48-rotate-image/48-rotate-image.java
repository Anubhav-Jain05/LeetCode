class Solution {
    public void rotate(int[][] matrix) {
        
        // first transpose the matrix    1,2,3==1,4,7
        
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        // second step- reverse the matrix    1,4,7==7,4,1
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
    }
}