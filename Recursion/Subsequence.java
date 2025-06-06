import java.util.ArrayList;

public class Subsequence {
  public static void pattern(int[] arr, ArrayList<Integer> list, int index, int size) {
    if (index >= size) {
      for (int element : list)
        System.out.print(element + " ");
      if (list.size() == 0)
        System.out.print("{}");
      System.out.println();
      return;
    }
    list.add(arr[index]);
    pattern(arr, list, index + 1, size);
    list.remove(list.size() - 1);
    pattern(arr, list, index + 1, size);
  }

  public static void main(String[] args) {
    int arr[] = { 3, 1, 2 };
    int size = arr.length;
    ArrayList<Integer> list = new ArrayList<>();
    int index = 0;
    pattern(arr, list, index, size);
  }
}