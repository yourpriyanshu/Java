import java.util.Scanner;

class HeadSets {
  private String headSetName;
  private String brand;
  private int price;
  private boolean available;

  public String getHeadSetName() {
    return headSetName;
  }

  public void setHeadSetName(String headSetName) {
    this.headSetName = headSetName;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public boolean getAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  public HeadSets(String headSetName, String brand, int price, boolean available) {
    this.headSetName = headSetName;
    this.brand = brand;
    this.price = price;
    this.available = available;
  }
}

public class Q2 {
  public static int findTotalPriceForGivenBrand(HeadSets[] arr, String input_brand) {
    int totalPrice = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].getBrand().equalsIgnoreCase(input_brand)) {
        totalPrice += arr[i].getPrice();
      }
    }
    return totalPrice;
  }

  public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets[] arr) {
    int minPrice = Integer.MAX_VALUE;
    ;
    int secondMinPrice = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].getPrice() < minPrice && arr[i].getAvailable() == true) {
        secondMinPrice = minPrice;
        minPrice = arr[i].getPrice();
      } else if (arr[i].getPrice() > minPrice && arr[i].getPrice() < secondMinPrice && arr[i].getAvailable() == true) {
        secondMinPrice = arr[i].getPrice();
      }
    }
    int secondMinPriceIndex = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].getPrice() == secondMinPrice) {
        return arr[i];
      }
    }
    return null; // If no second minimum price headset is found
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HeadSets[] arr = new HeadSets[4];
    for (int i = 0; i < arr.length; i++) {
      String headSetName = sc.nextLine();
      String brand = sc.nextLine();
      int price = sc.nextInt();
      boolean available = sc.nextBoolean();
      sc.nextLine(); // Consume newline

      arr[i] = new HeadSets(headSetName, brand, price, available);
    }
    String input_brand = sc.nextLine();
    int totalPrice = findTotalPriceForGivenBrand(arr, input_brand);
    if (totalPrice > 0) {
      System.out.println(totalPrice);
    } else {
      System.out.println("No Headsets available with the given brand");
    }
    HeadSets secondMinHeadSet = findAvailableHeadsetWithSecondMinPrice(arr);
    if (secondMinHeadSet != null) {
      System.out.println(secondMinHeadSet.getHeadSetName());
      System.out.println(secondMinHeadSet.getPrice());
    } else {
      System.out.println("No Headsets available");
    }
  }
}