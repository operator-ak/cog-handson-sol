
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the source");
    String source = in.nextLine();

    System.out.println("Enter the destination");
    String destination = in.nextLine();

    System.out.println("Enter the coach type");
    String coachType = in.nextLine();

    Map<String, Integer> coachTypes = new HashMap<>();

    coachTypes.put("AC1", 1);
    coachTypes.put("AC2", 2);
    coachTypes.put("AC3", 3);
    coachTypes.put("SLEEPER", 4);
    coachTypes.put("SEATER", 5);

    if (!coachTypes.containsKey(coachType.toUpperCase())) {
      System.out.println("Invalid Coach Type");
      return;
    }

    TrainManagementSystem tManagementSystem = new TrainManagementSystem();
    ArrayList<Train> trains = tManagementSystem.viewTrain(coachType, source, destination);

    if (trains.size() == 0) {
      System.out.println("No trains found");
      return;
    }

    for (Train train : trains) {
      System.out.println(String.format("%d %s", train.getTrainNumber(), train.getTrainName()));
    }
  }
}