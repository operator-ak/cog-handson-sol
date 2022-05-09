import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    final int ROWS = 6, COLS = 6;

    final int[][] arr = new int[ROWS][COLS];

    for (int i = 0; i < ROWS; i++) {
      String[] inputs = in.nextLine().trim().split(" ");

      for (int j = 0; j < COLS; j++) {
        arr[i][j] = Integer.parseInt(inputs[j]);
      }
    }

    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i < ROWS - 3 + 1; i++) {
      for (int j = 0; j < COLS - 3 + 1; j++) {
        int colCount = 1;
        int sum = 0;
        for (int p = i; p < i + 3; p++) {
          for (int k = j; k < j + 3; k++) {
            if (colCount != 4 && colCount != 6)
              sum += arr[p][k];
            colCount++;
          }
        }

        if (sum > maxSum) {
          maxSum = sum;
        }
      }
    }

    System.out.println(maxSum);
  }
}