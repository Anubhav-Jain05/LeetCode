class Solution {
    public boolean checkValid(int[][] matrix) {
        Set hs = new HashSet();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                int no = matrix[i][j];
                if(!hs.add(no +"int rows" + i) || !hs.add(no + "in column" + j) ){
                    return false;
                }
            }
        }
        return true;
    }
}