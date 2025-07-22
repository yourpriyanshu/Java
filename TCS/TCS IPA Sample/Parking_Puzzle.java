import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parking_Puzzle {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int vehicles = Integer.parseInt(br.readLine());
    int wheels = Integer.parseInt(br.readLine());

    // Let x= no. of 4 wheelers
    // Let vehicles - x = no. of 2 wheelers
    // wheels = 4*x + 2*(vehicles - x)
    // wheels = 4*x + 2*vehicles - 2*x
    // wheels = 2*vehicles + 2*x
    // 2*x = wheels - 2*vehicles
    // x = (wheels - 2*vehicles) / 2

    if (wheels < 2 * vehicles || wheels > 4 * vehicles || wheels % 2 != 0) {
      System.out.println("Invalid Input");
      return;
    }
    int FW = (wheels - 2 * vehicles) / 2;
    int TW = vehicles - FW;
    System.out.print("TW = " + TW + " ");
    System.out.print("FW = " + FW);
  }
}