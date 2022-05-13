public class AudiFactory extends Factory {

  @Override
  Headlight makeHeadlight() {
    return new AudiHeadlight();
  }

  @Override
  Tire makeTire() {
    return new AudiTire();
  }

}
