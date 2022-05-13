
public class MovableAdapterImpl implements MovableAdapter {
  private Movable luxuryAdapter;

  public MovableAdapterImpl(Movable luxuryAdapter) {
    this.luxuryAdapter = luxuryAdapter;
  }

  @Override
  public double getSpeed() {
    return convertMPHtoKMPH(luxuryAdapter.getSpeed());
  }

  private double convertMPHtoKMPH(double mph) {
    return mph * 1.60934;
  }

  @Override
  public double getPrice() {
    return convertUSDtoEURO(luxuryAdapter.getPrice());
  }

  private double convertUSDtoEURO(double usd) {
    return usd * 0.95;
  }

}
