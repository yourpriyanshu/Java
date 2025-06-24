public class Valid_Sudoku_36 {
  public static boolean checkSudoku(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        char c = board[i][j];
        if (c != '.') {
          board[i][j] = '.'; // Temporarily clear the cell to avoid matching itself
          if (!isSafe(board, i, j, c))
            return false;
          board[i][j] = c; // Restore the cell after checking
        }
      }
    }
    return true;
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
        { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '9', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '.' },
        { '.', '6', '.', '.', '.', '5', '3', '.', '.' },
        { '.', '.', '2', '4', '1', '9', '.', '.', '.' },
        { '3', '.', '.', '2', '8', '6', '.', '7', '.' }
    };
    checkSudoku(board);
    System.out.println("Is the Sudoku valid? " + checkSudoku(board));
  }

}
