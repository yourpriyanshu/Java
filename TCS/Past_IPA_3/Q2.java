import java.util.Scanner;

class Projector {
  private int projectorId;
  private String projectorName;
  private int price;
  private int rating;
  private String availableIn;

  public int getProjectorId() {
    return projectorId;
  }

  public void setProjectorId(int projectorId) {
    this.projectorId = projectorId;
  }

  public String getProjectorName() {
    return projectorName;
  }

  public void setProjectorName(String projectorName) {
    this.projectorName = projectorName;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public String getAvailableIn() {
    return availableIn;
  }

  public void setAvailableIn(String availableIn) {
    this.availableIn = availableIn;
  }

  public Projector(int projectorId, String projectorName, int price, int rating, String availableIn) {
    this.projectorId = projectorId;
    this.projectorName = projectorName;
    this.price = price;
    this.rating = rating;
    this.availableIn = availableIn;
  }
}

public class Q2 {
  public static Projector findMaximumPriceByRating(Projector[] arr, int input_rating) {
    int maxPrice = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].getRating() > input_rating && arr[i].getAvailableIn().equalsIgnoreCase("TataCliq")) {
        if (arr[i].getPrice() > maxPrice)
          maxPrice = arr[i].getPrice();
      }
    }
    for (int i = 0; i < 4; i++) {
      if (arr[i].getPrice() == maxPrice) {
        return arr[i];
      }
    }
    return null; // Return null if no projector matches the criteria
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Projector[] arr = new Projector[4];
    for (int i = 0; i < arr.length; i++) {
      int projectorId = sc.nextInt();
      sc.nextLine(); // Consume the newline character
      String projectorName = sc.nextLine();
      int price = sc.nextInt();
      int rating = sc.nextInt();
      sc.nextLine(); // Consume the newline character
      String availableIn = sc.nextLine();
      arr[i] = new Projector(projectorId, projectorName, price, rating, availableIn);
    }
    int input_rating = sc.nextInt();
    Projector maxPriceObject = findMaximumPriceByRating(arr, input_rating);
    if (maxPriceObject != null) {
      System.out.println(maxPriceObject.getProjectorId());
    } else {
      System.out.println("No such Projector");
    }
    sc.close();
  }
}