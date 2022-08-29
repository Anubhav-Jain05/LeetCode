class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs =new HashSet<>();
       // Set hs = new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    String str="(" + board[i][j] + ")";
                    if(!hs.add(str+i)|| !hs.add(j + str) || !hs.add(i/3+str + j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}