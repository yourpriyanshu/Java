import java.util.*;

class Spotify {
  private int spotifyId;
  private String profileName;
  private String subscriptionType;
  private double subscriptionPrice;
  private String groupSessionAvailable;

  public int getSpotifyId() {
    return spotifyId;
  }

  public void setSpotifyId(int spotifyId) {
    this.spotifyId = spotifyId;
  }

  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }

  public String getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(String subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  public double getSubscriptionPrice() {
    return subscriptionPrice;
  }

  public void setSubscriptionPrice(double subscriptionPrice) {
    this.subscriptionPrice = subscriptionPrice;
  }

  public String getGroupSessionAvailable() {
    return groupSessionAvailable;
  }

  public void setGroupSessionAvailable(String groupSessionAvailable) {
    this.groupSessionAvailable = groupSessionAvailable;
  }

  Spotify(int spotifyId, String profileName, String subscriptionType, double subscriptionPrice,
      String groupSessionAvailable) {
    this.spotifyId = spotifyId;
    this.profileName = profileName;
    this.subscriptionType = subscriptionType;
    this.subscriptionPrice = subscriptionPrice;
    this.groupSessionAvailable = groupSessionAvailable;
  }
}

public class MyClass {
  public static double findAvgSpotifySubsByType(Spotify[] arr, String input_subscriptionType,
      String input_groupSessionAvailable) {
    double avg = 0.0;
    double sum = 0.0;
    int count = 0;

    for (int i = 0; i < 4; i++) {
      if (arr[i].getSubscriptionType().equalsIgnoreCase(input_subscriptionType)
          && arr[i].getGroupSessionAvailable().equalsIgnoreCase(input_groupSessionAvailable)) {
        sum += arr[i].getSubscriptionPrice();
        count++;
      }
    }

    if (count > 0) {
      avg = sum / count;
      return avg;
    }
    return 0.0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Spotify[] arr = new Spotify[4];
    for (int i = 0; i < 4; i++) {
      int spotifyId = sc.nextInt();
      sc.nextLine();
      String profileName = sc.nextLine();
      String subscriptionType = sc.nextLine();
      double subscriptionPrice = sc.nextDouble();
      sc.nextLine();
      String groupSessionAvailable = sc.nextLine();

      arr[i] = new Spotify(spotifyId, profileName, subscriptionType, subscriptionPrice, groupSessionAvailable);
    }

    String input_subscriptionType = sc.nextLine();
    String input_groupSessionAvailable = sc.nextLine();
    double avg = findAvgSpotifySubsByType(arr, input_subscriptionType, input_groupSessionAvailable);

    if (avg > 0) {
      System.out.println(avg);
    } else {
      System.out.println("There are no such Spotify Subscription");
    }
  }
}