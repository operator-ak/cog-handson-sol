public class Supervisor extends ILeaveRequestHandler {

  public Supervisor() {
    super.nextHandler = new ProjectManager();
  }

  @Override
  public void handleRequest(LeaveRequest request) {
    if (request.getLeaveDays() > 3) {
      super.nextHandler.handleRequest(request);
      return;
    }

    System.out.println("Request handled by Supervisor");
  }

}
