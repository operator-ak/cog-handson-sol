
public class Loan {

  public double calculateLoanAmount(Employee employeeObj) {
    if (employeeObj instanceof PermanentEmployee) {
      return employeeObj.salary * 0.15;
    }

    if (employeeObj instanceof TemporaryEmployee) {
      return employeeObj.salary * 0.1;
    }

    return 0.0;
  }
}