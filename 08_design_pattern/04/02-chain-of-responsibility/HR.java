public class HR extends ILeaveRequestHandler {
  @Override
  public void handleRequest(LeaveRequest request) {
    System.out.println("Request handled by HR");
  }

}
