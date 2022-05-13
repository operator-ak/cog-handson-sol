import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeUtility {

  public Employee[] getEmployeeDetails(String[] details) {
    Employee[] employees = new Employee[details.length];

    for (int i = 0; i < details.length; i++) {
      String detail = details[i];
      String[] params = detail.split(";");

      Employee employee = new Employee();
      employee.setEmpId(params[0]);
      employee.setEmpName(params[1]);
      employee.setSalary(Double.parseDouble(params[2]));

      employees[i] = employee;
    }

    return employees;
  }

  public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {
    return Arrays.stream(empDetails);
  }

  public String[] shortlistedEmployee(Stream<Employee> empStream, double minSalary) {
    Predicate<Employee> predicate = x -> x.getSalary() >= minSalary;

    Stream<Employee> filterResult = empStream.filter(predicate).sorted((a, b) -> {
      return a.getEmpId().compareTo(b.getEmpId());
    });

    List<Employee> collect = filterResult.collect(Collectors.toList());

    Employee[] temp = new Employee[collect.size()];
    collect.toArray(temp);

    String[] shortlistedEmployees = new String[temp.length];

    for (int i = 0; i < shortlistedEmployees.length; i++) {
      shortlistedEmployees[i] = temp[i].toString();
    }

    return shortlistedEmployees;
  }
}
