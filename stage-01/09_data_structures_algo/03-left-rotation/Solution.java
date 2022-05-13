import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      String[] _inputLine1 = in.nextLine().split(" ");

      Integer n = Integer.parseInt(_inputLine1[0]);
      Integer d = Integer.parseInt(_inputLine1[1]);

      Integer[] arr = new Integer[n];
      String[] _inputLine2 = in.nextLine().split(" ");

      for (int i = 0; i < _inputLine2.length; i++) {
        arr[i] = Integer.parseInt(_inputLine2[i]);
      }

      Integer[] res = new Integer[n];
      for (int i = 0; i < res.length; i++) {
        res[mod(i - d, n)] = arr[i];

      }

      for (int i = 0; i < res.length; i++) {
        System.out.print(res[i] + " ");
      }

    }
  }

  public static int mod(int a, int b) {
    if (a == 0)
      return 0;

    if (a > 0) {
      if (a < b) {
        return a;
      }

      return a % b;
    }

    return mod(a + b, b);
  }
}