public class Account {
  private int accountNumber;
  private Customer customerObj;
  private double balance;

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Customer getCustomerObj() {
    return customerObj;
  }

  public void setCustomerObj(Customer customerObj) {
    this.customerObj = customerObj;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

}