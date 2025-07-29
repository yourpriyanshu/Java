import java.util.Scanner;

public class Q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int count = 0;
    // char ch = input.toCharArray();
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      if (ch >= 'a' && ch <= 'z') {
        count++;
      }
    }
    if (count > 0) {
      System.out.println(count);
    } else {
      System.out.println("No lowercase characters present");
    }
  }
}
