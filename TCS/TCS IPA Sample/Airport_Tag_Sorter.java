import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Character;
import java.util.ArrayList;

public class Airport_Tag_Sorter {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String tag = br.readLine();
    ArrayList<String> list = new ArrayList<>();
    String str1 = "";
    String str2 = "";

    char[] arr = tag.toCharArray();
    for (char c : arr) {
      if (Character.isLetter(c))
        str1 += c;
      else if (Character.isDigit(c))
        str2 += c;
    }
    if (str1.length() > 0)
      list.add(str1);
    if (str2.length() > 0)
      list.add(str2);

    System.out.println(list);
  }
}
