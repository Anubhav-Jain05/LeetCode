class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr= new int[n][n];
        
        int rowbeg=0;
        int rowend=n-1;
        int colbeg=0;
        int colend=n-1;
        int num=1;
        
        while(rowbeg <= rowend && colbeg <= colend){
            for(int i=colbeg;i<=colend;i++){
                arr[rowbeg][i]=num++;
            }
            rowbeg++;
            
            for(int i=rowbeg;i<=rowend;i++){
                 arr[i][colend]=num++;
            }
            colend--;
            
            if(rowbeg <= rowend){
                for(int i=colend;i>=colbeg;i--){
                arr[rowend][i]=num++;
                }
            }
            rowend--;
            
            if(colbeg <= colend){
                for(int i=rowend;i>=rowbeg;i--){
                     arr[i][colbeg]=num++;
                }
            }
            colbeg++;
                
                
                
            
        }
        return arr;
            
    }
}