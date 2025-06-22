import java.util.*;

public class Rat_in_Maze {
  public static void main(String[] args) {
    int[][] maze = {
        { 1, 0, 0, 0 },
        { 1, 1, 0, 1 },
        { 0, 1, 0, 0 },
        { 1, 1, 1, 1 }
    };

    int n = maze.length;
    List<String> paths = new ArrayList<>();
    boolean[][] visited = new boolean[n][n];

    if (maze[0][0] == 1)
      solve(0, 0, maze, n, "", visited, paths);

    System.out.println("All paths: " + paths);
  }

  static void solve(int x, int y, int[][] maze, int n, String path, boolean[][] visited, List<String> paths) {
    if (x == n - 1 && y == n - 1) {
      paths.add(path);
      return;
    }

    // Mark cell as visited
    visited[x][y] = true;

    // Directions: Down, Left, Right, Up
    int[] dx = { 1, 0, 0, -1 };
    int[] dy = { 0, -1, 1, 0 };
    char[] dir = { 'D', 'L', 'R', 'U' };

    for (int i = 0; i < 4; i++) {
      int newX = x + dx[i];
      int newY = y + dy[i];

      if (isSafe(newX, newY, maze, visited, n)) {
        solve(newX, newY, maze, n, path + dir[i], visited, paths);
      }
    }

    // Backtrack
    visited[x][y] = false;
  }

  static boolean isSafe(int x, int y, int[][] maze, boolean[][] visited, int n) {
    return x >= 0 && x < n && y >= 0 && y < n &&
        maze[x][y] == 1 && !visited[x][y];
  }
}
