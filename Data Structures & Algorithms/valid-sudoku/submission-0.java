class Solution {
    public boolean isValidSudoku(char[][] board) {
       Set<String> s=new HashSet<>();
       for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            char n=board[i][j];
            if(n!='.'){
                if(!s.add(n+"at row"+i)||!s.add(n+"at col"+j)||
                !s.add(n+"at box"+i/3+"-"+j/3)){
                    return false;
                }
            }
        }
       }return true;
    }
}
