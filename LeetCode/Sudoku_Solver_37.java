import java.util.Arrays;

public class Sudoku_Solver_37 {
  public static boolean solveBoard(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == '.') {
          for (char c = '1'; c <= '9'; c++) {
            if (isSafe(board, i, j, c)) {
              board[i][j] = c;
              if (solveBoard(board))
                return true;
              else
                board[i][j] = '.';// Backtrack
            }
          }
          return false; // If no number can be placed, return false
        }
      }
    }
    return true; // If all cells are filled correctly
  }

  public static boolean isSafe(char[][] board, int row, int col, char c) {
    for (int i = 0; i < board.length; i++) {
      if (board[i][col] == c)
        return false; // Check column
      if (board[row][i] == c)
        return false; // Check row
      if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
        return false; // Check 3x3 subgrid
    }
    return true; // If no conflicts found
  }

  public static void main(String[] args) {
    char[][] board = {
        { '9', '5', '7', '.', '1', '3', '.', '8', '4' },
        { '4', '8', '3', '.', '5', '7', '1', '.', '6' },
        { '.', '1', '2', '.', '4', '9', '5', '3', '7' },
        { '1', '7', '.', '3', '.', '4', '9', '.', '2' },
        { '5', '.', '4', '9', '7', '.', '3', '6', '.' },
        { '3', '.', '9', '5', '.', '8', '7', '.', '1' },
        { '8', '4', '5', '7', '9', '.', '6', '1', '3' },
        { '.', '9', '1', '.', '3', '6', '.', '7', '5' },
        { '7', '.', '6', '1', '8', '5', '4', '.', '9' }
    };
    solveBoard(board);
    // System.out.print(board); can't do it directly for 2D arrays will give random
    // character adrress
    // System.out.print(Arrays.deepToString(board)); do this instead to print 2D
    // array
    for (char[] row : board) {
      for (char cell : row) {
        System.out.print(cell + " ");
      }
      System.out.println();
    }
  }
}