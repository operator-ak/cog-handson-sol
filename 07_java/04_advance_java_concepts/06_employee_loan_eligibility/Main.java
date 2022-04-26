import java.util.Scanner;

//DO NOT EDIT OR DELETE
public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    EmployeeUtility utilObj = new EmployeeUtility();

    System.out.println("Enter the number of Employees");
    int n = Integer.parseInt(in.nextLine());

    if (n <= 0) {
      System.out.println("Invalid Input");
      return;
    }

    System.out.println("Enter the details of Employees");
    String[] details = new String[n];

    for (int i = 0; i < n; i++) {
      details[i] = in.nextLine();
    }

    System.out.println("Enter the minimum eligible salary");
    double minSalary = in.nextDouble();

    String[] result = utilObj.shortlistedEmployee(utilObj.getStreamOfEmployee(utilObj.getEmployeeDetails(details)),
        minSalary);

    if (result.length == 0) {
      System.out.println("No Employee is having the required salary");
      return;
    }

    System.out.println("Shortlisted Employees are");
    for (String s : result) {
      System.out.println(s);
    }

  }
}
