import java.util.Scanner;

class Resort {
  private int resortId;
  private String resortName;
  private String category;
  private double price;
  private double rating;

  public int getResortId() {
    return resortId;
  }

  public void setResortId(int resortId) {
    this.resortId = resortId;
  }

  public String getResortName() {
    return resortName;
  }

  public void setResortName(String resortName) {
    this.resortName = resortName;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  Resort(int resortId, String resortName, String category, double price, double rating) {
    this.resortId = resortId;
    this.resortName = resortName;
    this.category = category;
    this.price = price;
    this.rating = rating;
  }
}

public class Q2 {
  public static int findAvgPriceByCategory(Resort[] resort, String input_category) {
    int count = 0;
    int avgAmount = 0;
    int avgPrice = 0;
    for (int i = 0; i < resort.length; i++) {
      if (resort[i].getCategory().equalsIgnoreCase(input_category) && resort[i].getRating() > 4.0) {
        avgAmount += resort[i].getPrice();
        count++;
      }
      if (count > 0) {
        avgPrice = avgAmount / count;
      }
    }
    return avgPrice;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Resort[] resort = new Resort[4];
    for (int i = 0; i < resort.length; i++) {
      int resortId = sc.nextInt();
      sc.nextLine(); // Consume newline
      String resortName = sc.nextLine();
      String category = sc.nextLine();
      double price = sc.nextDouble();
      double rating = sc.nextDouble();
      sc.nextLine(); // Consume newline

      resort[i] = new Resort(resortId, resortName, category, price, rating);
    }
    String input_category = sc.nextLine();
    int avgPrice = findAvgPriceByCategory(resort, input_category);
    if (avgPrice > 0) {
      System.out.println("Average Price of the " + input_category + "Resort : " + avgPrice);
    } else {
      System.out.println("There are no such available resort");
    }
  }
}