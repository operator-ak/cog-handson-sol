import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      String[] input = in.nextLine().trim().split(" ");

      Long[] arr = new Long[input.length];

      for (int i = 0; i < input.length; i++) {
        arr[i] = Long.parseLong(input[i]);
      }

      Long cSum = 0l;
      for (int i = 0; i < arr.length; i++) {
        cSum += arr[i];
      }

      Long max = Long.MIN_VALUE;
      Long min = Long.MAX_VALUE;

      for (int i = 0; i < arr.length; i++) {
        if ((cSum - arr[i]) > max) {
          max = cSum - arr[i];
        }

        if ((cSum - arr[i]) < min) {
          min = cSum - arr[i];
        }
      }

      System.out.println(min + " " + max);
    }
  }
}