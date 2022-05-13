public class BasicUser implements IUser {
  private IChatMediator chatMediator;
  private String name;

  public BasicUser(IChatMediator chatMediator, String name) {
    this.chatMediator = chatMediator;
    this.name = name;
  }

  @Override
  public void receiveMessage(String message) {
    System.out.println(String.format("Name: %s, Message: %s", name, message));
  }

  @Override
  public void sendMessage(String message) {
    chatMediator.sendMessage(message);
  }

}
