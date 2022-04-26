import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {

  private static Map<String, Double> employeeMap = new HashMap<>();

  public Map<String, Double> getEmployeeMap() {
    return employeeMap;
  }

  public void setEmployeeMap(Map<String, Double> employeeMap) {
    this.employeeMap = employeeMap;
  }

  public void addEmployeeDetails(String employeeName, double salary) {
    employeeMap.put(employeeName, salary);
  }

  public static EmployeeAudit findEmployee() {
    EmployeeAudit funcAudit = salary -> {
      ArrayList<String> names = new ArrayList<>();

      for (Entry<String, Double> emp : employeeMap.entrySet()) {
        if (emp.getValue() <= salary) {
          names.add(emp.getKey());
        }
      }

      return names;
    };

    return funcAudit;
  }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Main main = new Main();

    String menu = "1.Add Employee Details" +

        "\n2.Find Employee Details" +

        "\n3.Exit";

    while (true) {
      System.out.println(menu);
      System.out.println("Enter the choice");
      int choice = Integer.parseInt(in.nextLine());

      if (choice == 1) {
        System.out.println("Enter the Employee name");
        String employeeName = in.nextLine();

        System.out.println("Enter the Employee Salary");
        double salary = Double.parseDouble(in.nextLine());

        main.addEmployeeDetails(employeeName, salary);
        continue;
      }

      if (choice == 2) {
        System.out.println("Enter the salary to be searched");
        double salary = Double.parseDouble(in.nextLine());

        EmployeeAudit fAudit = findEmployee();
        ArrayList<String> names = fAudit.fetchEmployeeDetails(salary);

        if (names.isEmpty()) {
          System.out.println("No Employee Found");
          continue;
        }

        System.out.println("Employee List");

        for (String name : names) {
          System.out.println(name);
        }

        continue;
      }

      if (choice == 3) {
        System.out.println("Let's complete the session");
        break;
      }
    }

  }

}
