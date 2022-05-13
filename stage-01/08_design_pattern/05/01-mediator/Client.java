public class Client {
  public static void main(String[] args) {
    IChatMediator chatMediator = new ChatMediator();

    IUser receiver1 = new BasicUser(chatMediator, "receiver1");
    IUser receiver2 = new BasicUser(chatMediator, "receiver3");
    IUser receiver3 = new PremiumUser(chatMediator, "receiver3");

    chatMediator.addUser(receiver1);
    chatMediator.addUser(receiver2);
    chatMediator.addUser(receiver3);

    IUser sender = new BasicUser(chatMediator, "sender");
    sender.sendMessage("Message from sender");
  }

}
