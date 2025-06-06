public class Reverse {
  public static int[] reverse(int[] arr, int n, int i) {
    if (i >= n / 2) {
      return arr;
    }
    // Swap elements
    int temp = arr[i];
    arr[i] = arr[n - i - 1];
    arr[n - i - 1] = temp;

    // Recursive call
    return reverse(arr, n, i + 1);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int n = arr.length;
    int[] result = reverse(arr, n, 0);
    System.out.println("Reversed array:");
    for (int i = 0; i < n; i++) {
      System.out.print(result[i] + " ");
    }
  }
}