package Backtracking;

public class sudoko1 {
    public static void solveSudoku(char[][] board){
        sudokosolver(board,0,0);
    }
    public static boolean isSafe(char[][] board, int row, int col,int digit){
        //for row
        for (int i = 0; i <= 8; i++) {
            if(board[i][col] == digit){
                return false;
            }
        }
        //for column 
        for (int j = 0; j <= 8; j++) {
            if(board[row][j] == digit){
                return false;
            }
        }
        //grid
        int sr = (row)/3 * 3;
        int sc = (col)/3 * 3;
        for (int i = sr; i < sr+3; i++) {
            for (int j = sc; j < sc+3; j++) {
                if(board[i][j] == digit){
                    return false;
                }
            }
        }
            return true;
    }
    public static boolean sudokosolver(char[][] board, int row, int col){
        //base case 
        if(row == 9 || col == 9){
            return true;
        }
        else if(row == 9){
            return false;
        }

        int nextrow = row,nextcol = col+1;
        if(col+1 == 9){
            nextrow = row + 1;
            nextcol = 0;
        }
        if (board[row][col] != 0) {
            return sudokosolver(board, nextrow, nextcol);
        }
            for (int digit = 0; digit <= 9; digit++) {
                if(isSafe(board,row,col,digit)){
                    board[row][col] = (char) digit;
                    if(sudokosolver(board, nextrow, nextcol)){
                        return true;
                    }
                }
            }
                board[row][col] = 0;
        return false;       
    }
}
