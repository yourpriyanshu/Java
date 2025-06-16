public class Sudoku_Solver_37 {

  public static void main(String[] args) {
    int[][] board = {
        { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
        { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
        { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
        { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
        { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
        { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
        { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
        { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
        { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
    };

    if (solve(board)) {
      printBoard(board);
    } else {
      System.out.println("No solution exists.");
    }
  }

  public static boolean solve(int[][] board) {
    for (int row = 0; row < 9; row++) {
      for (int col = 0; col < 9; col++) {
        if (board[row][col] == 0) { // Empty cell
          for (int num = 1; num <= 9; num++) {
            if (isValid(board, row, col, num)) {
              board[row][col] = num;
              if (solve(board))
                return true;
              board[row][col] = 0; // Backtrack
            }
          }
          return false; // No valid number found
        }
      }
    }
    return true; // All cells filled
  }

  public static boolean isValid(int[][] board, int row, int col, int num) {
    for (int i = 0; i < 9; i++) {
      // Check row and column
      if (board[row][i] == num || board[i][col] == num)
        return false;

      // Check 3x3 box
      int boxRow = 3 * (row / 3) + i / 3;
      int boxCol = 3 * (col / 3) + i % 3;
      if (board[boxRow][boxCol] == num)
        return false;
    }
    return true;
  }

  public static void printBoard(int[][] board) {
    for (int[] row : board) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}
