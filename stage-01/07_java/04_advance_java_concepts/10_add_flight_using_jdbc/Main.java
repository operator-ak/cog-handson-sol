import java.util.*;

public class Main {
  public static void main(String[] args) {
    Flight flightObj = new Flight(1, "Lucknow", "Bangalore", 2, 4823.22);

    FlightManagementSystem fms = new FlightManagementSystem();

    boolean isAdded = fms.addFlight(flightObj);

    if (isAdded) {
      System.out.println("Flight details added successfully");
      return;
    }
    System.out.println("Addition not done");
  }
}