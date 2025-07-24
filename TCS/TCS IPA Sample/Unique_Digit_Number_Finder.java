import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Unique_Digit_Number_Finder {
  public static boolean isUniqueDigit(int number) {
    HashMap<Integer, Integer> frequency = new HashMap<>();
    while (number > 0) {
      int digit = number % 10;
      if (frequency.containsKey(digit)) {
        return false; // Digit already exists, not unique
      } else {
        frequency.put(digit, 1); // Mark digit as seen
      }
      number = number / 10;
    }
    return true; // All digits are unique
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int lower_limit = Integer.parseInt(br.readLine());
    int upper_limit = Integer.parseInt(br.readLine());
    int count = 0;

    for (int i = lower_limit; i <= upper_limit; i++) {
      if (isUniqueDigit(i)) {
        count++;
      }
    }
    if (count > 0) {
      System.out.println("Number of unique digits : " + count); // Output the count of unique digit numbers
    } else {
      System.out.println("No unique digit numbers found in the range.");
    }
    br.close();
  }
}
