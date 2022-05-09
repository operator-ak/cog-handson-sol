public class MercedesFactory extends Factory {

  @Override
  Headlight makeHeadlight() {
    return new MercedesHeadlight();
  }

  @Override
  Tire makeTire() {
    return new MercedesTire();
  }

}
