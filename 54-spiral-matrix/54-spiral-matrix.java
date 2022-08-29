class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rowbeg=0;
        int rowend=matrix.length-1;
        int colbeg=0;
        int colend=matrix[0].length-1;
        
        while(rowbeg <= rowend && colbeg <= colend){
            
            // traverse right
            
            for(int j=colbeg;j<=colend;j++){
                list.add(matrix[rowbeg][j]);
            }
            rowbeg++;
            
            // traverse down
            
            for(int i=rowbeg;i<=rowend;i++){
                list.add(matrix[i][colend]);
            }
            colend--;
            
            //traverse left
            
            if(rowbeg <= rowend){
                for(int i=colend;i>=colbeg;i--){
                    list.add(matrix[rowend][i]);
                }
            }
            rowend--;
            
            //traverse top
            
            if(colbeg <= colend){
                for(int i=rowend;i>=rowbeg;i--){
                    list.add(matrix[i][colbeg]);
                }
            }
            colbeg++;
            
            
            
        }
        return list;
        
    }
}