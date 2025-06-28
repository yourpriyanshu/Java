//experimenting
public class Queen_capture_3001 {

  public static int minMovesToCaptureQueen(int a, int b, int c, int d, int e, int f) {
    boolean[][] board = new boolean[9][9]; // 1-indexed (0th row/col unused)

    // Place rook and bishop
    board[a][b] = true;
    board[c][d] = true;

    // Rook tries to capture the queen

    // Up
    for (int i = a - 1; i >= 1; i--) {
      if (board[i][b])
        break;
      if (i == e && b == f)
        return 1;
    }

    // Down
    for (int i = a + 1; i <= 8; i++) {
      if (board[i][b])
        break;
      if (i == e && b == f)
        return 1;
    }

    // Left
    for (int j = b - 1; j >= 1; j--) {
      if (board[a][j])
        break;
      if (a == e && j == f)
        return 1;
    }

    // Right
    for (int j = b + 1; j <= 8; j++) {
      if (board[a][j])
        break;
      if (a == e && j == f)
        return 1;
    }

    // Bishop tries to capture the queen

    // Top-left
    for (int i = c - 1, j = d - 1; i >= 1 && j >= 1; i--, j--) {
      if (board[i][j])
        break;
      if (i == e && j == f)
        return 1;
    }

    // Top-right
    for (int i = c - 1, j = d + 1; i >= 1 && j <= 8; i--, j++) {
      if (board[i][j])
        break;
      if (i == e && j == f)
        return 1;
    }

    // Bottom-left
    for (int i = c + 1, j = d - 1; i <= 8 && j >= 1; i++, j--) {
      if (board[i][j])
        break;
      if (i == e && j == f)
        return 1;
    }

    // Bottom-right
    for (int i = c + 1, j = d + 1; i <= 8 && j <= 8; i++, j++) {
      if (board[i][j])
        break;
      if (i == e && j == f)
        return 1;
    }

    return 2; // If queen not captured in 1 move
  }

  public static void main(String[] args) {
    // System.out.println(minMovesToCaptureQueen(1, 1, 8, 8, 2, 3)); // Output: 2
    // System.out.println(minMovesToCaptureQueen(5, 3, 3, 4, 5, 2)); // Output: 1
  }
}
