import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Enter the minimum height");
    double minHeight = Double.parseDouble(in.nextLine());

    System.out.println("Enter the maximum weight");
    double maxWeight = Double.parseDouble(in.nextLine());

    String noRecordsFoundTemplate = "No players are with minimum height of %.1f and maximum weight of %.1f";

    PlayerSelectionSystem pSelectionSystem = new PlayerSelectionSystem();

    List<String> players = pSelectionSystem.playersBasedOnHeightWeight(minHeight, maxWeight);

    if (players.size() == 0) {
      System.out.println(String.format(noRecordsFoundTemplate, minHeight, maxWeight));
      return;
    }

    for (String player : players) {
      System.out.println(player);
    }
  }
}