public class FactoryGetter {
  public static Factory getFactory(String type) {
    if (type.equals("audi")) {
      return new AudiFactory();
    }

    if (type.equals("mercedes")) {
      return new MercedesFactory();
    }

    return null;
  }
}
