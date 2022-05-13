import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int k = in.nextInt();

    List<Integer> arr = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      arr.add(in.nextInt());
    }

    System.out.println(divisibleSumPairs(n, k, arr));

  }

  public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    int[] map = calculateFrequency(ar, k);

    int t = map[0];
    int count = t * (t - 1) / 2;

    for (int i = 1; i < map.length; i++) {
      int j = k - i;
      if (i < j) {
        count += (map[i] * map[j]);
        continue;

      }

      if (i == j) {
        t = map[i];
        count += (t * (t - 1) / 2);
      }
    }

    return count;
  }

  public static int[] calculateFrequency(List<Integer> arr, int k) {
    int[] map = new int[k];

    for (int e : arr) {
      map[e % k]++;
    }

    return map;
  }
}
