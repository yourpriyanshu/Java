import java.util.ArrayList;
import java.util.Collections;

public class Subset_Sums {
  public static void findSubsetsSum(int[] arr, int N, int index, int sum, ArrayList<Integer> ans) {
    if (index == N) {
      ans.add(sum);
      return;
    }
    sum += arr[index];
    findSubsetsSum(arr, N, index + 1, sum, ans);
    sum -= arr[index];
    findSubsetsSum(arr, N, index + 1, sum, ans);
  }

  public static void main(String[] args) {
    int N = 2;
    int[] arr = { 2, 3 };
    ArrayList<Integer> ans = new ArrayList<>();
    int index = 0;
    int sum = 0;
    findSubsetsSum(arr, N, index, sum, ans);
    Collections.sort(ans);
    System.out.println(ans);
  }
}