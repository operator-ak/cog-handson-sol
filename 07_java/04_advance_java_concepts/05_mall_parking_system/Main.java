import java.sql.Date;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      LocalDateTime currentTime = LocalDateTime.parse("2019-10-29T20:10:00");

      Pattern pattern = Pattern.compile("^[0-9]{2}/[0-9]{2}/[0-9]{4} [0-9]{2}:[0-9]{2}$");

      System.out.println("In-time");
      String sInTime = in.nextLine();
      Matcher matcher = pattern.matcher(sInTime);

      if (!matcher.matches()) {
        System.out.printf("%s is an Invalid In-Time", sInTime);
        return;
      }

      String[] inTimeParams = sInTime.split(" ");
      LocalDateTime inTime = LocalDateTime.of(LocalDate.parse(getParseDate(inTimeParams[0])),
          LocalTime.parse(getParseTime(inTimeParams[1])));

      long currentTimeAndInTimeDiff = Duration.between(inTime, currentTime).getSeconds();

      if (currentTimeAndInTimeDiff <= 0 || currentTimeAndInTimeDiff < 60) {
        System.out.printf("%s is an Invalid In-Time", sInTime);
        return;
      }

      System.out.println("Out-time");
      String sOutTime = in.nextLine();

      matcher = pattern.matcher(sOutTime);

      if (!matcher.matches()) {
        System.out.printf("%s is an Invalid Out-Time", sOutTime);
        return;
      }

      String[] outTimeParams = sOutTime.split(" ");
      LocalDateTime outTime = LocalDateTime.of(LocalDate.parse(getParseDate(outTimeParams[0])),
          LocalTime.parse(getParseTime(outTimeParams[1])));

      long outTimeAndInTimeDiff = Duration.between(inTime, outTime).getSeconds();

      if (outTimeAndInTimeDiff <= 0 || outTimeAndInTimeDiff < 60) {
        System.out.printf("%s is an Invalid Out-Time", sOutTime);
        return;
      }

      double seconds = Duration.between(inTime, outTime).getSeconds();
      double hours = Math.ceil(seconds / 3600);
      int amount = (int) hours * 10;
      System.out.printf("%d Rupees", amount);
    }
  }

  private static String getParseDate(String date) {
    String[] p = date.split("/");
    return String.format("%s-%s-%s", p[2], p[1], p[0]);
  }

  private static String getParseTime(String time) {
    return String.format("%s:00", time);
  }
}