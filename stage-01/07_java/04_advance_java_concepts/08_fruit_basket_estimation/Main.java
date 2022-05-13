import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String fruitName = "";
    int weightInKgs = 0;
    int pricePerKg = 0;

    int option = 0;

    FruitBasketUtility utilObj = new FruitBasketUtility();

    do {
      System.out.println("Select an option:\n1.Add Fruit to Basket\n2.Calculate Bill\n3.Exit");

      option = Integer.parseInt(in.nextLine());

      if (option == 1) {
        System.out.println("Enter the fruit name");
        fruitName = in.nextLine();
        System.out.println("Enter weight in Kgs");
        weightInKgs = Integer.parseInt(in.nextLine());
        System.out.println("Enter price per Kg");
        pricePerKg = Integer.parseInt(in.nextLine());

        FruitBasket fbObj = new FruitBasket(fruitName, weightInKgs, pricePerKg);
        utilObj.addToBasket(fbObj);

        continue;
      }

      if (option == 2) {
        List<FruitBasket> fruitBasketList = utilObj.getFruitBasketList();

        if (fruitBasketList.isEmpty()) {
          System.out.println("Your basket is empty. Please add fruits.");
          continue;
        }

        Stream<FruitBasket> fruitBasketStream = fruitBasketList.stream();
        int billAmount = utilObj.calculateBill(fruitBasketStream);

        System.out.println("The estimated bill amount is Rs " + billAmount);

        continue;
      }

      if (option == 3) {
        System.out.println("Thank you for using the application.");
        break;
      }

      System.out.println("Invalid option. Please try again.");

    } while (option != 3);

  }

}
