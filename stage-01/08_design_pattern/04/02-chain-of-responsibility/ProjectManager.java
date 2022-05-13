public class ProjectManager extends ILeaveRequestHandler {

  public ProjectManager() {
    super.nextHandler = new HR();
  }

  @Override
  public void handleRequest(LeaveRequest request) {
    if (request.getLeaveDays() > 5) {
      super.nextHandler.handleRequest(request);
      return;
    }

    System.out.println("Request handled by ProjectManager");
  }

}
