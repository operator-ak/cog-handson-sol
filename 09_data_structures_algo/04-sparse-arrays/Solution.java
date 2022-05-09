import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      Integer noOfStrings = Integer.parseInt(in.nextLine());
      String[] strings = new String[noOfStrings];

      for (int i = 0; i < strings.length; i++) {
        strings[i] = in.nextLine();
      }

      Integer noOfQueries = Integer.parseInt(in.nextLine());
      String[] queries = new String[noOfQueries];

      for (int i = 0; i < queries.length; i++) {
        queries[i] = in.nextLine();
      }

      for (int i = 0; i < queries.length; i++) {
        String query = queries[i];
        int count = 0;
        for (String string : strings) {
          if (string.equalsIgnoreCase(query)) {
            count++;
          }
        }

        System.out.println(count);
        count = 0;
      }
    }
  }
}
