import static org.junit.Assert.assertEquals;

public class MovableAdapterTest {

  public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
    Movable bugattiVeyron = new BugattiVeyron();
    MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

    assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.000001);
    assertEquals(bugattiVeyronAdapter.getPrice(), 180555.10, 0.1);
  }

  public static void main(String[] args) {
    MovableAdapterTest test = new MovableAdapterTest();
    test.whenConvertingMPHToKMPH_thenSuccessfullyConverted();
  }
}
