import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      System.out.println("Welcome to our site. Would you likt to order or repair?");
      String processOption = in.nextLine().trim().toLowerCase();

      PhoneOrder phoneOrder = new PhoneOrder();
      PhoneRepair phoneRepair = new PhoneRepair();
      String productDetails;

      if (processOption.equals("order")) {
        System.out.println("Please provide the phone model name");
        productDetails = in.nextLine().trim();
        phoneOrder.processOrder(productDetails);
        return;
      }

      if (processOption.equals("repair")) {
        System.out.println("Is it the phone or the accessory that you want to be repaied?");
        String productType = in.nextLine().trim().toLowerCase();

        if (productType.equals("phone")) {
          System.out.println("Please provide the phone model name");
          productDetails = in.nextLine().trim();
          phoneRepair.processPhoneRepair(productDetails);

          return;
        }

        System.out.println("Please provide the accessory detail, like headphone, tempered glass");
        productDetails = in.nextLine().trim();
        phoneRepair.processAccessoryRepair(productDetails);

        return;
      }
    }
  }
}
