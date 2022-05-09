import java.util.LinkedList;
import java.util.List;

public class ChatMediator implements IChatMediator {
  private List<IUser> users = new LinkedList<>();

  @Override
  public void addUser(IUser user) {
    users.add(user);
  }

  @Override
  public void sendMessage(String message) {
    for (IUser user : users) {
      user.receiveMessage(message);
    }
  }

}
