import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {
  public static void main(String[] args) {
    ArrayException obj = new ArrayException();
    System.out.println(obj.getPriceDetails());
  }

  public String getPriceDetails() {
    try {
      Scanner in = new Scanner(System.in);

      System.out.println("Enter the number of elements in the array");
      int size = Integer.parseInt(in.nextLine());

      System.out.println("Enter the price details");
      int[] arr = new int[size];

      for (int i = 0; i < size; i++) {
        arr[i] = Integer.parseInt(in.nextLine());
      }

      System.out.println("Enter the index of the array element you want to access");
      int index = Integer.parseInt(in.nextLine());

      return "The array element is " + arr[index];
    } catch (ArrayIndexOutOfBoundsException e) {
      return "Array index is out of range";
    } catch (NumberFormatException | InputMismatchException e) {
      return "Input was not in the correct format";
    }
  }
}