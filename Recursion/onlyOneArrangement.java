import java.util.ArrayList;

public class onlyOneArrangement {
  public static boolean findOneArrangement(int[] arr, ArrayList<Integer> list, int index, int size, int target,
      int sum) {
    if (index >= size) {
      if (sum == target) {
        for (int element : list) {
          System.out.print(element + " ");
        }
        return true;
      }
      return false;
    }
    list.add(arr[index]);
    sum += arr[index];
    if (findOneArrangement(arr, list, index + 1, size, target, sum) == true)
      return true;
    sum -= arr[index];
    list.remove(list.size() - 1);
    if (findOneArrangement(arr, list, index + 1, size, target, sum) == true)
      return true;
    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int size = arr.length;
    ArrayList<Integer> list = new ArrayList<>();
    int target = 10;
    int sum = 0;
    int index = 0;
    findOneArrangement(arr, list, index, size, target, sum);
  }
}