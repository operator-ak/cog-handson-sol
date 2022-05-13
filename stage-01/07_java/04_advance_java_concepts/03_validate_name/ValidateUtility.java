import java.util.Scanner;

public class ValidateUtility {
  public static void main(String args[]) {
    try (Scanner in = new Scanner(System.in)) {
      String empName = in.nextLine();
      String prodName = in.nextLine();

      boolean isEmpNameValid = validateEmployeeName().validateName(empName);
      boolean isProdNameValid = validateProductName().validateName(prodName);

      System.out.println("Employee name is " + (isEmpNameValid ? "valid" : "invalid"));
      System.out.println("Product name is " + (isProdNameValid ? "valid" : "invalid"));
    }
  }

  public static Validate validateEmployeeName() {
    return (name) -> {
      if (name.length() < 5 || name.length() > 20)
        return false;

      for (int i = 0; i < name.length(); i++) {
        char ch = name.charAt(i);

        if (Character.isDigit(ch))
          return false;

        if (!Character.isLetter(ch) && !Character.isWhitespace(ch))
          return false;
      }

      return true;
    };
  }

  public static Validate validateProductName() {
    return (name) -> {
      char firstChar = name.charAt(0);
      if (!Character.isLetter(firstChar))
        return false;

      if (name.length() < 6)
        return false;

      int count = 0;
      for (int i = 1; i < name.length(); i++) {
        char ch = name.charAt(i);

        if (!Character.isDigit(ch))
          return false;

        count++;
      }

      if (count > 5)
        return false;

      return true;
    };
  }
}
