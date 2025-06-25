import java.util.Arrays;

public class N_Queen_2_52 {
  public static boolean isSafe(int row, int col, char[][] board, int n) {
    for (int i = 0; i < row; i++) {
      if (board[i][col] == 'Q')
        return false; // Check column
    }
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q')
        return false; // Check left diagonal
    }
    for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
      if (board[i][j] == 'Q')
        return false; // Check right diagonal
    }
    return true; // If no conflicts found
  }

  public static int solve(int row, int n, char[][] board, int count) {
    if (row == n) {
      return count + 1;
    }
    for (int col = 0; col < n; col++) {
      if (isSafe(row, col, board, n)) {
        board[row][col] = 'Q'; // Place the queen
        count = solve(row + 1, n, board, count); // Recur to place the next queen
        board[row][col] = '.'; // Backtrack and remove the queen
      }
    }
    return count;
  }

  public static int totalNQueens(int n) {
    int count = 0;
    char[][] board = new char[n][n];
    for (int i = 0; i < n; i++) {
      Arrays.fill(board[i], '.');
    }
    return solve(0, n, board, count);
  }

  public static void main(String[] args) {
    int n = 4;
    System.out.println("Total solutions for " + n + "-Queens: " + totalNQueens(n));
  }
}
