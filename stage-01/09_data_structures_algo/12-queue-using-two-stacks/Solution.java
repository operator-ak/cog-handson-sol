import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    List<Integer> queue = new LinkedList<>();

    Scanner in = new Scanner(System.in);

    int q = Integer.parseInt(in.nextLine());

    for (int i = 0; i < q; i++) {
      String[] inputs = in.nextLine().trim().split(" ");

      int operation = Integer.parseInt(inputs[0]);

      if (operation == 1) {
        int value = Integer.parseInt(inputs[1]);
        queue.add(value);
        continue;
      }

      if (operation == 2) {
        queue.remove(0);
        continue;
      }

      if (operation == 3) {
        System.out.println(queue.get(0));
        continue;
      }
    }
  }
}