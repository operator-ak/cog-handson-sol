import java.util.Scanner;

class Placement {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);

    String[] branches = { "CSE", "ECE", "MECH" };
    int[] placements = new int[3];

    boolean isInvalidInput = false;

    for (int i = 0; i < branches.length; i++) {
      String branch = branches[i];

      System.out.println("Enter the no of students placed in " + branch + ":");
      placements[i] = in.nextInt();

      if (placements[i] < 0) {
        isInvalidInput = true;
      }
    }

    in.close();

    if (isInvalidInput) {
      System.out.println("Input is Invalid");
      return;
    }

    if (placements[0] == placements[1] && placements[1] == placements[2]) {
      System.out.println("None of the department has got the highest placement");
      return;
    }

    int maxIndex = 0;
    for (int i = 1; i < placements.length; i++) {
      if (placements[i] > placements[maxIndex]) {
        maxIndex = i;
      }
    }

    System.out.println("Highest placement");

    for (int i = 0; i < placements.length; i++) {
      if (placements[i] == placements[maxIndex]) {
        System.out.println(branches[i]);
      }
    }

  }
}