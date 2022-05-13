import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Enter all roll numbers separated by comma");
    String rollNumbers = in.nextLine();

    Stream<String> rollNumberStream = getRollNumbers(rollNumbers);

    System.out.println("Enter the department name acronym");
    String dept = in.nextLine();

    int count = getCount(rollNumberStream, dept);

    if (count == 0) {
      System.out.printf("No students from %s", dept);
      return;
    }

    System.out.printf("Number of students in me is %d", count);
  }

  public static Stream<String> getRollNumbers(String rollNumbers) {
    return Arrays.stream(rollNumbers.split(","));
  }

  public static int getCount(Stream<String> rollNumberStream, String dept) {
    Predicate<String> predicate = rn -> rn.substring(0, 2).equalsIgnoreCase(dept);

    return rollNumberStream.filter(predicate).collect(Collectors.toList()).size();
  }

}
