import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution {
  public static List<Integer> reverseArray(List<Integer> a) {
    Iterator<Integer> listIt = a.iterator();

    List<Integer> reverseList = new ArrayList<>();

    while (listIt.hasNext()) {
      reverseList.add(0, listIt.next());
    }

    return reverseList;
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      Integer size = Integer.parseInt(in.nextLine());

      List<Integer> list = new ArrayList<>();

      String[] params = in.nextLine().trim().split(" ");

      for (int i = 0; i < size; i++) {
        int n = Integer.parseInt(params[i]);
        list.add(n);
      }

      list = reverseArray(list);

      for (Integer i : list) {
        System.out.print(i + " ");
      }
    }

  }
}