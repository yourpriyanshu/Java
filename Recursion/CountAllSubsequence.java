public class CountAllSubsequence {
  public static int findCount(int[] arr, int index, int size, int target, int sum) {
    if (index >= size) {
      if (sum == target) {
        return 1;
      }
      return 0;
    }
    sum += arr[index];
    int l = findCount(arr, index + 1, size, target, sum);
    sum -= arr[index];
    int r = findCount(arr, index + 1, size, target, sum);
    return l + r;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int target = 6;
    int size = arr.length;
    int index = 0;
    int sum = 0;
    int result = findCount(arr, index, size, target, sum);
    System.out.println("Total number of subsequences with sum " + target + " is: " + result);
  }
}