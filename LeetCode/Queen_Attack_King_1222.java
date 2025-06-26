import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Queen_Attack_King_1222 {
  public static List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
    List<List<Integer>> result = new ArrayList<>();
    boolean[][] board = new boolean[8][8];
    for (int[] q : queens) {
      board[q[0]][q[1]] = true;
    }
    int kx = king[0];
    int ky = king[1];
    // 1.up
    for (int i = kx - 1; i >= 0; i--) {
      if (board[i][ky]) {
        result.add(Arrays.asList(i, ky));
        break;
      }
    }
    // 2.down
    for (int i = kx + 1; i < 8; i++) {
      if (board[i][ky]) {
        result.add(Arrays.asList(i, ky));
        break;
      }
    }
    // 3. left
    for (int i = ky - 1; i >= 0; i--) {
      if (board[kx][i]) {
        result.add(Arrays.asList(kx, i));
        break;
      }
    }
    // 4. right
    for (int i = ky + 1; i < 8; i++) {
      if (board[kx][i]) {
        result.add(Arrays.asList(kx, i));
        break;
      }
    }
    // 5. Top-left
    for (int i = kx - 1, j = ky - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j]) {
        result.add(Arrays.asList(i, j));
        break;
      }
    }
    // 6. Top-right
    for (int i = kx - 1, j = ky + 1; i >= 0 && j < 8; i--, j++) {
      if (board[i][j]) {
        result.add(Arrays.asList(i, j));
        break;
      }
    }
    // 7. bottom-left
    for (int i = kx + 1, j = ky - 1; i < 8 && j >= 0; i++, j--) {
      if (board[i][j]) {
        result.add(Arrays.asList(i, j));
        break;
      }
    }
    // 8. bottom-right
    for (int i = kx + 1, j = ky + 1; i < 8 && j < 8; i++, j++) {
      if (board[i][j]) {
        result.add(Arrays.asList(i, j));
        break;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[][] queens = { { 0, 1 }, { 1, 0 }, { 4, 0 }, { 0, 4 }, { 3, 3 }, { 2, 4 } };
    int[] king = { 0, 0 };
    List<List<Integer>> result = queensAttacktheKing(queens, king);
    System.out.println("Queens attacking the King: " + result);
  }
}