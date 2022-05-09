public class Program {
  public static void main(String[] args) {
    LeaveRequest leaveRequest = new LeaveRequest();

    leaveRequest.setEmployeeName("Akshay");
    leaveRequest.setLeaveDays(7);

    ILeaveRequestHandler requestHandler = new Supervisor();

    requestHandler.handleRequest(leaveRequest);
  }
}
