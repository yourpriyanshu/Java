import java.util.ArrayList;
import java.util.List;

public class Combination_Sum_39 {
  public static void findCombinations(int index, int[] candidates, int target, List<List<Integer>> result,
      List<Integer> ds) {
    if (index == candidates.length) {
      if (target == 0)
        result.add(new ArrayList<>(ds));
      return;
    }

    if (candidates[index] <= target) {
      ds.add(candidates[index]);
      findCombinations(index, candidates, target - candidates[index], result, ds);
      ds.remove(ds.size() - 1);
    }

    findCombinations(index + 1, candidates, target, result, ds);
  }

  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    findCombinations(0, candidates, target, result, new ArrayList<>());
    return result;
  }

  public static void main(String[] args) {
    int[] candidates = { 2, 3, 5 };
    int target = 8;
    List<List<Integer>> combinations = combinationSum(candidates, target);
    System.out.println("Combinations summing to " + target + ": " + combinations);
  }
}
