import java.util.*;

public class N_Queen_51 {

  public static List<List<String>> solveNQueens(int n) {
    List<List<String>> result = new ArrayList<>();
    char[][] board = new char[n][n];

    // Fill board with '.'
    for (int i = 0; i < n; i++) {
      Arrays.fill(board[i], '.');
    }

    solve(0, board, result, n);
    return result;
  }

  public static void solve(int row, char[][] board, List<List<String>> result, int n) {
    if (row == n) {
      result.add(construct(board));
      return;
    }

    for (int col = 0; col < n; col++) {
      if (isSafe(row, col, board, n)) {
        board[row][col] = 'Q'; // Place Queen
        solve(row + 1, board, result, n); // Move to next row
        board[row][col] = '.'; // Backtrack
      }
    }
  }

  public static boolean isSafe(int row, int col, char[][] board, int n) {
    // Check column above
    for (int i = 0; i < row; i++)
      if (board[i][col] == 'Q')
        return false;

    // Check upper left diagonal
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
      if (board[i][j] == 'Q')
        return false;

    // Check upper right diagonal
    for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
      if (board[i][j] == 'Q')
        return false;

    return true;
  }

  public static List<String> construct(char[][] board) {
    List<String> res = new ArrayList<>();
    for (char[] row : board) {
      res.add(new String(row));
    }
    return res;
  }

  public static void main(String[] args) {
    int n = 4;
    List<List<String>> solutions = solveNQueens(n);
    for (List<String> board : solutions) {
      for (String row : board) {
        System.out.println(row);
      }
      System.out.println(); // Separate solutions
    }
  }
}
