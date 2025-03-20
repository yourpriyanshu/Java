
// In java , Take a number of test cases as user input, with 3 user inputs in each case such that we pick any two input of test case and increase them by 1 each time and decreased the unpicked one by 1 each time . We have  to find out whether all the element of test can be equal or not at some point of time . If yes then display minimum times 1 is increased . If not, then display -1 for that test case .
import java.util.Scanner;
import java.util.Arrays;

public class March_15th_Shift_1_Q1 {
  public static int minimumSteps(int a, int b, int c) {
    int[] arr = { a, b, c };
    int steps = 0;
    if (arr[0] == arr[1] && arr[1] == arr[2])
      return steps;
    Arrays.sort(arr);
    while (true) {
      if ((arr[0] == arr[1] && arr[1] + 1 == arr[2]) || (arr[1] == arr[2] && arr[0] + 1 == arr[1]))
        return -1;
      arr[0]++;
      arr[1]++;
      arr[2]--;
      steps++;
      Arrays.sort(arr);
      if (arr[0] == arr[1] && arr[1] == arr[2])
        return steps;
      if ((arr[0] == arr[1] && arr[1] + 1 == arr[2]) || (arr[1] == arr[2] && arr[0] + 1 == arr[1]))
        return -1;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number of test cases : ");
    int test_cases = sc.nextInt();
    int[][] list = new int[test_cases][3];
    for (int i = 0; i < test_cases; i++) {
      for (int j = 0; j < 3; j++) {
        list[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < test_cases; i++) {
      int a = list[i][0];
      int b = list[i][1];
      int c = list[i][2];
      int result = minimumSteps(a, b, c);
      System.out.println(result);
    }
    sc.close();
  }
}