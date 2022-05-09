public class PhoneOrder implements IOrder {
  @Override
  public void processOrder(String modelName) {
    System.out.println(String.format("%s order accepted!", modelName));
  }

}
