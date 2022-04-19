public class TemporaryEmployee extends Employee {

  private int hoursWorked;
  private int hourlyWages;

  // Getters and Setters

  public int getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(int hoursWorked) {
    this.hoursWorked = hoursWorked;
  }

  public int getHourlyWages() {
    return hourlyWages;
  }

  public void setHourlyWages(int hourlyWages) {
    this.hourlyWages = hourlyWages;
  }

  @Override
  public void calculateSalary() {
    salary = hoursWorked * hourlyWages;
  }

  public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
    super(employeeId, employeeName);
    this.hoursWorked = hoursWorked;
    this.hourlyWages = hourlyWages;
  }
}
