import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
  PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
  PriorityQueue<Integer> minHeap = new PriorityQueue<>();

  public void insert(int num) {
    if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
      maxHeap.add(num);
    } else {
      minHeap.add(num);
    }

    if (maxHeap.size() > minHeap.size() + 1) {
      minHeap.add(maxHeap.poll());
    } else if (maxHeap.size() < minHeap.size()) {
      maxHeap.add(minHeap.poll());
    }
  }

  public double findMedian() {
    if (maxHeap.size() == minHeap.size()) {
      return maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
    }

    return maxHeap.peek();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = Integer.parseInt(in.nextLine());

    Solution s = new Solution();

    for (int i = 1; i <= n; i++) {
      int num = Integer.parseInt(in.nextLine());
      s.insert(num);
      System.out.println(s.findMedian());
    }
  }
}