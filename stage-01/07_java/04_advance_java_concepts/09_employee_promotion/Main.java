import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the number of employees");
    int noOfEmps = Integer.parseInt(in.nextLine());

    if (noOfEmps <= 0)
      return;

    System.out.println("Enter the employee details");
    List<Employee> employeeList = new ArrayList<>();

    for (int i = 0; i < noOfEmps; i++) {
      String input = in.nextLine();
      String[] details = input.split(":");

      String empName = details[0];
      String empId = details[1];
      double empSalary = Double.parseDouble(details[2]);

      Employee employee = new Employee(empName, empId, empSalary);
      employeeList.add(employee);
    }

    System.out.println("Enter the number of times salary limit to be searched");
    int noOfQuery = Integer.parseInt(in.nextLine());

    if (noOfQuery <= 0)
      return;

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < noOfQuery; i++) {
      System.out.println("Enter the salary limit to be searched");
      double salaryLimit = Double.parseDouble(in.nextLine());

      Management management = new Management(salaryLimit, employeeList);
      management.run();

      result.append(String.format("%.1f : %d\n", salaryLimit, management.getCount()));
    }

    System.out.println(result);
  }
}
