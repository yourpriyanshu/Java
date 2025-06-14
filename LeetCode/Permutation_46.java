
// Permutation - All the arrangements of a given array using Recursion
// TC - n! x n
// SC - O(n) + O(n)
// Auxiliary SC - O(n) for recursion call
import java.util.*;

public class Permutation_46 {
  public static void findPermutations(int[] nums, List<List<Integer>> result, List<Integer> ds, boolean[] check) {
    if (ds.size() == nums.length) {
      result.add(new ArrayList<>(ds));
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      if (!check[i]) {
        ds.add(nums[i]);
        check[i] = true;
        findPermutations(nums, result, ds, check);
        ds.remove(ds.size() - 1);
        check[i] = false; // Backtracking step
      }
    }
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> ds = new ArrayList<>();
    boolean[] check = new boolean[nums.length];
    findPermutations(nums, result, ds, check);
    return result;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3 };
    List<List<Integer>> result = permute(nums);
    System.out.println("Permutations: " + result);
  }
}