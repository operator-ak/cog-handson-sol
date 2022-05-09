public class ProcessPhoneRepair {
  public void repairSteps(IPhone phone) {
    String part1 = phone.getPhonePart1();
    System.out.println(String.format("%s repaired", part1));

    Double partCost = phone.getPart1Cost();
    System.out.println(String.format("%d repaired", partCost * 0.5));
  }
}
