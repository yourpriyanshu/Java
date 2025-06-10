import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_39 {
  public static void findCombination(int[] arr, int target, int index, List<List<Integer>> result, List<Integer> ds) {
    if (index >= arr.length) {
      if (target == 0)
        result.add(new ArrayList<>(ds));
      return;
    }
    if (arr[index] <= target) {
      ds.add(arr[index]);
      findCombination(arr, target - arr[index], index, result, ds);
      ds.remove(ds.size() - 1);
    }
    findCombination(arr, target, index + 1, result, ds);
  }

  public static List<List<Integer>> combinationSum(int[] arr, int target) {
    List<List<Integer>> result = new ArrayList<>();
    findCombination(arr, target, 0, result, new ArrayList<>());
    return result;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, 5 };
    int target = 8;
    List<List<Integer>> result = combinationSum(arr, target);
    System.out.println(result);

  }
}