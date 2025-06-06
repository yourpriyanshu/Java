public class Febonacii {
  public static int feb(int n) {
    if (n <= 1) {
      return n;
    }
    return feb(n - 1) + feb(n - 2);
  }

  public static void main(String[] args) {
    int n = 5;
    System.out.println("Fibonacci of " + n + " is: " + feb(n));
  }
}