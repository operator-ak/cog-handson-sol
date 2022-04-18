import java.util.Scanner;

public class FuelConsumption {

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      System.out.println("Enter the no of liters to fill the tank");
      int liters = in.nextInt();

      if (isNotValid(liters)) {
        System.out.println(liters + " is an Invalid Input");
        return;
      }

      System.out.println("Enter the distance covered");
      int distance = in.nextInt();

      if (isNotValid(distance)) {
        System.out.println(distance + " is an Invalid Input");
        return;
      }

      System.out.println("Liters/100KM");
      System.out.printf("%.2f%n", calculateFuelConsumptionInUS(liters, distance));

      double miles = kmIntoMiles(distance);
      double gallons = litersIntoGallons(liters);

      System.out.println("Miles/gallons");
      System.out.printf("%.2f%n", calculateFuelConsumptionInEurope(gallons, miles));
    }
  }

  public static double calculateFuelConsumptionInEurope(double gallons, double miles) {
    return miles / gallons;
  }

  public static double calculateFuelConsumptionInUS(double litres, double distance) {
    return litres / distance * 100;
  }

  public static double kmIntoMiles(double km) {
    double consumption = km * 0.6214f;
    return Math.round(consumption * 100) / 100.0;
  }

  public static double litersIntoGallons(double liters) {
    return liters * 0.2642;
  }

  public static boolean isNotValid(double n) {
    return n <= 0;
  }
}
