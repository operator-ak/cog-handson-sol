import java.util.SortedMap;
import java.util.TreeMap;

class Test {
  public static void main(String args[]) {
    TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
    hm.put(2, "Two");
    hm.put(4, "Four");
    hm.put(1, "One");
    hm.put(6, "Six");
    hm.put(7, "Seven");
    SortedMap<Integer, String> sm = hm.subMap(2, 7);
    SortedMap<Integer, String> sm2 = sm.tailMap(4);
    System.out.print(sm2);
  }
}