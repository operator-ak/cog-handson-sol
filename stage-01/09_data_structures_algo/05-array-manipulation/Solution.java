import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      String[] input1 = in.nextLine().trim().split(" ");

      int n = Integer.parseInt(input1[0]);
      int q = Integer.parseInt(input1[1]);

      long[] arr = new long[(n + 1)];

      for (int i = 0; i < q; i++) {
        String[] input2 = in.nextLine().trim().split(" ");
        int a = Integer.parseInt(input2[0]) - 1;
        int b = Integer.parseInt(input2[1]);
        long k = Integer.parseInt(input2[2]);

        arr[a] += k;
        arr[b] -= k;
      }

      long max = 0;
      for (int i = 1; i < arr.length; i++) {
        arr[i] += arr[i - 1];

        if (arr[i] > max) {
          max = arr[i];
        }
      }

      System.out.println(max);
    }
  }
}