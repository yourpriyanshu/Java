class Solution {
  public void findCombinations(int[] candidates, int target, int index, List<List<Integer>> result, List<Integer> ds) {
    if (index >= candidates.length) {
      if (target == 0) {
        Collections.sort(ds);
        result.add(new ArrayList<>(ds));
      }
      return;
    }
    if (candidates[index] <= target) {
      ds.add(candidates[index]);
      findCombinations(candidates, target - candidates[index], index + 1, result, ds);
      ds.remove(ds.size() - 1);
    }
    findCombinations(candidates, target, index + 1, result, ds);
  }

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> result = new ArrayList<>();
    findCombinations(candidates, target, 0, result, new ArrayList<>());
    return result;
  }
}