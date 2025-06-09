import java.util.ArrayList;
import java.util.List;

public class NestedArrayListExample {
  public static void main(String[] args) {
    // Declare a List where each element is an ArrayList of Strings
    List<ArrayList<String>> listOfArrayLists = new ArrayList<>();

    // Create and add inner ArrayLists
    ArrayList<String> innerList1 = new ArrayList<>();
    innerList1.add("Apple");
    innerList1.add("Banana");
    listOfArrayLists.add(innerList1);

    ArrayList<String> innerList2 = new ArrayList<>();
    innerList2.add("Carrot");
    innerList2.add("Daikon");
    innerList2.add("Eggplant");
    listOfArrayLists.add(innerList2);

    // Accessing elements
    // Get the first inner ArrayList
    ArrayList<String> firstInnerList = listOfArrayLists.get(0);
    System.out.println("First element of the first inner list: " + firstInnerList.get(0)); // Output: Apple

    // Iterate through the List of ArrayLists
    for (ArrayList<String> innerList : listOfArrayLists) {
      for (String item : innerList) {
        System.out.print(item + " ");
      }
      System.out.println();
    }
  }
}