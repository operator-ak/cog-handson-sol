//Make this class inherit the Employee class

public class PermanentEmployee extends Employee {
  private double basicPay;

  // Getters and Setters

  public double getBasicPay() {
    return basicPay;
  }

  public void setBasicPay(double basicPay) {
    this.basicPay = basicPay;
  }

  @Override
  public void calculateSalary() {
    double pfAmount = basicPay * 0.12;
    salary = basicPay - pfAmount;
  }

  public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
    super(employeeId, employeeName);
    this.basicPay = basicPay;
  }
}