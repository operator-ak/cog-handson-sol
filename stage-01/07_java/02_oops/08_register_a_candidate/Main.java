import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try {
      Candidate candidate = getCandidateDetails();
      if (candidate != null) {
        System.out.println("Registration Successful");
      }
    } catch (InvalidSalaryException e) {
      System.out.println(e.getMessage());
    }
  }

  public static Candidate getCandidateDetails() throws InvalidSalaryException {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the candidate Details");

    System.out.println("Name");
    String name = in.nextLine();

    System.out.println("Gender");
    String gender = in.nextLine();

    System.out.println("Expected Salary");
    double expectedSalary = Double.parseDouble(in.nextLine());

    if (expectedSalary < 10000) {
      throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
    }

    Candidate candidate = new Candidate();
    candidate.setName(name);
    candidate.setGender(gender);
    candidate.setExpectedSalary(expectedSalary);

    return candidate;
  }
}
