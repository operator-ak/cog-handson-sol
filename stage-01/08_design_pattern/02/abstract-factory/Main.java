public class Main {
  public static void main(String[] args) {
    Factory audiFactory = FactoryGetter.getFactory("audi");

    audiFactory.makeHeadlight();
    audiFactory.makeTire();
  }
}
