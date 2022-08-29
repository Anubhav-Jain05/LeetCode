class Solution {
    public boolean isValidSudoku(char[][] board) {
       /* HashSet<String> hs =new HashSet<>();
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
        return true;*/
        
        //HashSet<Integer> hs = new HashSet<>();
       /* Set hs = new HashSet();
        for(int i=0;i<9;++i){
            for(int j=0;j<9;++j){
                char no= board[i][j];
                if(no != '.'){
                    if(!hs.add(no + i) || 
                       !hs.add(no + j) || 
                       !hs.add( no + i/3 +"-"+ j/3)){
                        return false;
                    }
                }
            }
        }
        return true;*/
        
        Set seen = new HashSet();
    for (int i=0; i<9; ++i) {
        for (int j=0; j<9; ++j) {
            char number = board[i][j];
            if (number != '.')
                if (!seen.add(number + " in row " + i) ||
                    !seen.add(number + " in column " + j) ||
                    !seen.add(number + " in block " + i/3 + "-" + j/3))
                    return false;
        }
    }
    return true;

    }
}
























