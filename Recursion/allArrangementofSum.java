import java.util.ArrayList;

public class allArrangementofSum {
  public static void findAllArrangement(int[] arr, ArrayList<Integer> list, int index, int size, int target, int sum) {
    if (index >= size) {
      if (sum == target) {
        for (int element : list)
          System.out.print(element + " ");
        System.out.println();
      }
      return;
    }
    list.add(arr[index]);
    sum += arr[index];
    findAllArrangement(arr, list, index + 1, size, target, sum);
    sum -= arr[index];
    list.remove(list.size() - 1);
    findAllArrangement(arr, list, index + 1, size, target, sum);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int size = arr.length;
    int target = 10;
    int index = 0;
    int sum = 0;
    ArrayList<Integer> list = new ArrayList<>();
    findAllArrangement(arr, list, index, size, target, sum);
  }
}