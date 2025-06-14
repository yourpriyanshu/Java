
// Array with duplicate elements but we have not to pick any duplicate subsets 
import java.util.*;

public class Subsets_90 {
  public static void findSubsets(int[] nums, int index, List<List<Integer>> result, List<Integer> ds) {
    result.add(new ArrayList<>(ds));
    for (int i = index; i < nums.length; i++) {
      if (i > index && nums[i] == nums[i - 1])
        continue;
      ds.add(nums[i]);
      findSubsets(nums, i + 1, result, ds);
      ds.remove(ds.size() - 1);
    }

  }

  public static List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    int index = 0;
    List<Integer> ds = new ArrayList<>();
    findSubsets(nums, 0, result, ds);
    return result;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 2 };
    List<List<Integer>> result = subsetsWithDup(nums);
    System.out.println("Subsets with duplicates: " + result);
  }
}