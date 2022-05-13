import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
  public static void main(String[] args) {
    Stack<Character> stack;

    Scanner in = new Scanner(System.in);

    int n = Integer.parseInt(in.nextLine());

    for (int i = 0; i < n; i++) {
      String input = in.nextLine();
      stack = new Stack<>();

      boolean isMatch = true;

      for (int j = 0; j < input.length(); j++) {
        Character c = input.charAt(j);

        if (c == '(' || c == '{' || c == '[') {
          stack.push(c);
          continue;
        }

        if (stack.size() == 0) {
          isMatch = false;
          break;
        }

        Character top = stack.pop();

        if (c == ')' && top != '(') {
          isMatch = false;
          break;
        }

        if (c == '}' && top != '{') {
          isMatch = false;
          break;
        }

        if (c == ']' && top != '[') {
          isMatch = false;
          break;
        }
      }

      System.out.println(stack.size() > 0 ? "NO" : isMatch ? "YES" : "NO");
    }
  }
}