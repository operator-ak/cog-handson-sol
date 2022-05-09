import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
  private State state;
  private List<Observer> observers = new ArrayList<>();

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
    this.notifyUpdate(new Message("Subject state changed"));
  }

  @Override
  public void attach(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void detach(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyUpdate(Message message) {
    for (Observer observer : observers) {
      observer.update(message);
    }
  }

}
