public class M_Coloring_Problem {
  // Function to check if the current color assignment is valid
  private static boolean isSafe(int node, int[][] graph, int[] color, int n, int col) {
    for (int k = 0; k < n; k++) {
      if (graph[node][k] == 1 && color[k] == col) {
        return false;
      }
    }
    return true;
  }

  // Backtracking function to try assigning colors
  private static boolean solve(int node, int[][] graph, int[] color, int m, int n) {
    if (node == n) {
      return true; // All nodes colored successfully
    }

    for (int i = 1; i <= m; i++) {
      if (isSafe(node, graph, color, n, i)) {
        color[node] = i;
        if (solve(node + 1, graph, color, m, n)) {
          return true;
        }
        color[node] = 0; // Backtrack
      }
    }

    return false; // No color could be assigned
  }

  // Main function to solve M-Coloring problem
  public static boolean graphColoring(int[][] graph, int m, int n) {
    int[] color = new int[n];
    return solve(0, graph, color, m, n);
  }

  // Driver code
  public static void main(String[] args) {
    int[][] graph = {
        { 0, 1, 1, 1 },
        { 1, 0, 1, 0 },
        { 1, 1, 0, 1 },
        { 1, 0, 1, 0 }
    };
    int m = 3; // Number of colors
    int n = graph.length; // Number of nodes

    if (graphColoring(graph, m, n)) {
      System.out.println("Coloring is possible.");
    } else {
      System.out.println("Coloring is not possible.");
    }
  }
}
