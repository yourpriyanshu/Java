import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Combination_Sum_40 {
  public static void findCombinations(int[] candidates, int target, int index, List<List<Integer>> result,
      List<Integer> ds) {
    if (target == 0) {
      result.add(new ArrayList<>(ds));
      return;
    }
    for (int i = index; i < candidates.length; i++) {
      if (i > index && candidates[i] == candidates[i - 1])
        continue; // skip duplicates
      if (candidates[i] > target)
        break; // no need to continue if the candidate exceeds the target
      ds.add(candidates[i]);
      findCombinations(candidates, target - candidates[i], i + 1, result, ds);
      ds.remove(ds.size() - 1); // backtrack
    }
  }

  public static List<List<Integer>> CombinationSum2(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    findCombinations(candidates, target, 0, result, new ArrayList<>());
    return result;
  }

  public static void main(String[] args) {
    int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
    Arrays.sort(candidates);
    int target = 8;
    List<List<Integer>> result = CombinationSum2(candidates, target);
    System.out.println("Combinations that sum to " + target + ":" + " " + result);
  }
}