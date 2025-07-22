import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_Num {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the number :");
    int num = Integer.parseInt(br.readLine());
    int reverseNum = 0;
    while (num != 0) {
      int digit = num % 10;
      reverseNum = reverseNum * 10 + digit;
      num = num / 10;
    }
    System.out.println("Reverse is : " + reverseNum);
  }
}