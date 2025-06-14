import java.util.*;

public class Approach_2_46 {
  public static void findPermuatations(int index, int[] nums, List<List<Integer>> result) {
    if (index == nums.length) {
      List<Integer> ds = new ArrayList<>();
      for (int i = 0; i < nums.length; i++) {
        ds.add(nums[i]);
      }
      result.add(new ArrayList<>(ds));
      return;
    }
    for (int i = index; i < nums.length; i++) {
      swap(i, index, nums);
      findPermuatations(index + 1, nums, result);
      swap(i, index, nums); // Backtracking step
    }
  }

  public static void swap(int i, int j, int[] nums) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    findPermuatations(0, nums, result);
    return result;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3 };
    List<List<Integer>> result = permute(nums);
    System.out.println("Permutations: " + result);
  }
}
