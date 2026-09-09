class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<HashSet<Character>> rows=new ArrayList<>();
        ArrayList<HashSet<Character>> cols=new ArrayList<>();
        for(int i=0;i<9;i++){
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
        }
        
        for(int boxes=0;boxes<81;boxes++){
            int row=boxes/9;
            int col=boxes%9;
            char c=board[row][col];
            HashSet<Character> gridSet=new HashSet<>();
            if(row%3==0 && col%3==0){
                for(int i=row;i<row+3;i++){
                    for(int j=col;j<col+3;j++){
                        if(board[i][j]!='.'){
                            if(gridSet.contains(board[i][j])){
                                return false;
                            }else{
                                gridSet.add(board[i][j]);
                            }
                        }
                    }
                }
            }
            if(c!='.'){
                HashSet<Character> thatRow=rows.get(row);
                HashSet<Character> thatCol=cols.get(col);
                if(thatRow.contains(c) || thatCol.contains(c)){
                    return false;
                }
                thatRow.add(c);
                thatCol.add(c);
            }
        }
        System.out.println(rows);
        System.out.println(cols);

        return true;
        
                
    }
}
