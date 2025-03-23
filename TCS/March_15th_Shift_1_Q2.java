//summation of pairs of integers where each pair represnt starting and ending index 

import java.util.Scanner;

public class March_15th_Shift_1_Q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String[] str = input.split(" ");
    int[] arr = new int[str.length];
    for (int i = 0; i < str.length; i++) {
      arr[i] = Integer.parseInt(str[i]);
    }
    int sum = 0;
    for (int i = 0, j = 1; j <= arr.length - 1; i += 2, j += 2) {
      while (arr[i] <= arr[j]) {
        sum += arr[i];
        arr[i]++;
      }
    }
    System.out.println(sum);
    sc.close();
  }
}