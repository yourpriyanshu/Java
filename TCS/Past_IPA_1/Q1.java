
//Count words From Sentence with Vowel as First Character
import java.util.Scanner;

public class Q1 {
  public static boolean checkWord(String word) {
    char firstCharacter = word.toLowerCase().charAt(0);
    if (firstCharacter == 'a' || firstCharacter == 'e' || firstCharacter == 'i' ||
        firstCharacter == 'o' || firstCharacter == 'u') {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] words = str.split(" ");
    int count = 0;
    for (String element : words) {
      if (checkWord(element)) {
        count++;
      }
    }

    if (count > 0) {
      System.out.println(count);
    } else {
      System.out.println("No String Found");
    }
    sc.close();
  }
}