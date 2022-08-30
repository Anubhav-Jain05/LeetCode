class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         for(int i=0;i<matrix.length;i++){
              for(int j=0;j<matrix[0].length;j++){
                  if(matrix[i][j]==target){
                      return true;
                  }
              }
          }
        return false;
        
        
        /*int n=matrix.length;
        int m=matrix[0].length;
        
        int i=0;
        int j=n*m-1;
        
        while(i<=j){
            int  mid= (j+i)/2;
            if(matrix[mid/m][mid%m]==target){
                return true;
            }
            if(matrix[mid/m][mid%m]<=target){
                i=mid+1;
            }else{
                j=mid-1;
            }
            
        }
        return false;*/
    }
}