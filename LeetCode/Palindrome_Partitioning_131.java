import java.util.*;

public class Palindrome_Partitioning_131 {

  public static List<List<String>> partition(String s) {
    List<List<String>> result = new ArrayList<>();
    backtrack(s, 0, new ArrayList<>(), result);
    return result;
  }

  private static void backtrack(String s, int start, List<String> path, List<List<String>> result) {
    if (start == s.length()) {
      result.add(new ArrayList<>(path));
      return;
    }

    for (int end = start + 1; end <= s.length(); end++) {
      String sub = s.substring(start, end);
      if (isPalindrome(sub)) {
        path.add(sub);
        backtrack(s, end, path, result);
        path.remove(path.size() - 1); // backtrack
      }
    }
  }

  private static boolean isPalindrome(String str) {
    int l = 0, r = str.length() - 1;
    while (l < r) {
      if (str.charAt(l++) != str.charAt(r--))
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "aab";
    List<List<String>> partitions = partition(s);
    System.out.println(partitions);
  }
}
