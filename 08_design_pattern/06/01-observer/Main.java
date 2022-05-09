public class Main {
  public static void main(String[] args) {
    MessageSubscriberOne s1 = new MessageSubscriberOne();
    MessageSubscriberTwo s2 = new MessageSubscriberTwo();
    MessageSubscriberThree s3 = new MessageSubscriberThree();

    MessagePublisher publisher = new MessagePublisher();

    publisher.attach(s1);
    publisher.attach(s2);

    publisher.notifyUpdate(new Message("First Message"));

    publisher.detach(s1);
    publisher.attach(s3);

    publisher.notifyUpdate(new Message("Second Message"));

    publisher.setState(new State());
  }
}
