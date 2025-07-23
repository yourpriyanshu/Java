import java.util.HashSet;
import java.util.Iterator;

public class is_Hashset {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();

    // Insert
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1); // Duplicate, will not be added

    // length of set
    System.out.println("Initial size of HashSet: " + set.size());

    // Print all elements
    System.out.println("Elements in HashSet: " + set); // [1, 2, 3]

    // Search
    if (set.contains(1)) {
      System.out.println("The HashSet contains the element 1.");
    } else if (!set.contains(1)) {
      System.out.println("The HashSet does not contain the element 1.");
    }

    // Remove
    // set.remove(1);
    // if (!set.contains(1)) {
    // System.out.println("The HashSet does not contain the element 1.");
    // }

    // Iterator
    Iterator i = set.iterator();
    while (i.hasNext())
      System.out.print(i.next() + " ");

  }
}
