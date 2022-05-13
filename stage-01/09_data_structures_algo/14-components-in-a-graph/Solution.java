import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int[] parent = new int[2 * n + 1];
    int[] count = new int[2 * n + 1];

    for (int i = 1; i <= 2 * n; i++) {
      count[i] = 1;
      parent[i] = i;
    }

    for (int i = 0; i < n; i++) {
      int g = in.nextInt();
      int b = in.nextInt();
      int root_g = g;
      int root_b = b;
      while (parent[root_g] != root_g)
        root_g = parent[root_g];

      while (parent[root_b] != root_b)
        root_b = parent[root_b];

      if (root_b == root_g)
        continue;

      if (count[root_b] < count[root_g]) {
        parent[root_b] = root_g;
        count[root_g] += count[root_b];
        continue;
      }

      parent[root_g] = root_b;
      count[root_b] += count[root_g];
    }

    int min = 2 * n + 1;
    int max = 2;
    for (int i = 1; i <= 2 * n; i++) {
      if (parent[i] != i)
        continue;

      if (count[i] == 1)
        continue;

      min = Math.min(min, count[i]);
      max = Math.max(max, count[i]);
    }
    System.out.println(min + " " + max);
  }
}