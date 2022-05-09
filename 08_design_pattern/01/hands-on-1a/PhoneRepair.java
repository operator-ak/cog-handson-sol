public class PhoneRepair implements IRepair {
  @Override
  public void processPhoneRepair(String modelName) {
    System.out.println(String.format("%s repair accepted!", modelName));
  }

  @Override
  public void processAccessoryRepair(String accessoryType) {
    System.out.println(String.format("%s repair accepted!", accessoryType));
  }
}
