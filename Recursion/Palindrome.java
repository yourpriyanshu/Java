public class Palindrome {
  public static Boolean isPalindrome(String str, int n, int i) {
    if (i >= n / 2)
      return true;
    if (str.charAt(i) != str.charAt(n - i - 1))
      return false;
    return isPalindrome(str, n, i + 1);
  }

  public static void main(String[] args) {
    String str = "1221";
    int n = str.length();
    Boolean result = isPalindrome(str, n, 1);
    System.out.println("Is the string a palindrome? " + result);
  }
}