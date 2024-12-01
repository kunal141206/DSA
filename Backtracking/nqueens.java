package Backtracking;
import java.util.ArrayList;
import java.util.List;

public class nqueens {
    public List<List<String>> solveNQueens(int n){
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        solve(0, board, res);
        return res;
    }
    public static void solve(int row,char[][] board,List<List<String>> res){
        if(row == board.length){
            res.add(construct(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';  // Place the queen
                solve(row + 1, board, res);  // Recur for the next row
                board[row][col] = '.';  // Backtrack (remove the queen)
            }
        }
    }
    public static boolean isSafe(char[][] board,int row,int col){
        //vertical up
        for (int i = 0; i < row; i++) {
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //upper-left diagonal
        for (int i = row-1,j = col-1 ;i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //upper right diagonal
        for(int i = row - 1 , j = col + 1;i >= 0 && j<board.length;i--,j++ ){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
            return true;
    }
    private static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }
}
