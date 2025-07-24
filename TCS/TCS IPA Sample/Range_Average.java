import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Range_Average {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input1 = br.readLine();
    String[] numbers1 = input1.split(" ");
    int[] arr = new int[numbers1.length];
    for (int i = 0; i < numbers1.length; i++) {
      arr[i] = Integer.parseInt(numbers1[i]);
    }
    // System.out.print(Arrays.toString(arr)); - [100, 200, 300, 400, 500]
    // for (int element : arr) {
    // System.out.print(element + " "); - 100 200 300 400 500
    // }
    // System.out.print(arr); - [I@1f32e575 - prints the memory reference of the
    // array, not its contents

    String input2 = br.readLine();
    String[] numbers2 = input2.split(" ");
    int lower_limit = Integer.parseInt(numbers2[0]);
    int upper_limit = Integer.parseInt(numbers2[1]);

    int sum = 0;
    int count = 0;
    int average = 0;
    for (int element : arr) {
      if (element >= lower_limit && element <= upper_limit) {
        sum += element;
        count++;
      }
    }
    try {
      average = sum / count;
    } catch (ArithmeticException e) {
      System.out.println("Average is : " + count);
      return;
    }
    System.out.println("Average is : " + average);
  }
}
