import java.util.*;

public class Subsets {
  public static void findSubsets(int[] nums, int index, List<List<Integer>> result, List<Integer> ds) {
    if (index == nums.length) {
      result.add(new ArrayList<>(ds));
      return;
    }
    findSubsets(nums, index + 1, result, ds);
    ds.add(nums[index]);
    findSubsets(nums, index + 1, result, ds);
    ds.remove(ds.size() - 1);
  }

  public static List<List<Integer>> subsets(int[] nums) {
    List<Integer> ds = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    findSubsets(nums, 0, result, ds);

    // Sorting the list of subsets in lexicographical order
    Collections.sort(result, new Comparator<List<Integer>>() {
      public int compare(List<Integer> a, List<Integer> b) {
        int i = 0;
        while (i < a.size() && i < b.size()) {
          int cmp = Integer.compare(a.get(i), b.get(i));
          if (cmp != 0)
            return cmp;
          i++;
        }
        return Integer.compare(a.size(), b.size());
      }
    });

    return result;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3 };
    List<List<Integer>> result = Subsets.subsets(nums);
    System.out.println(result);
  }
}
