public abstract class ILeaveRequestHandler {
  public ILeaveRequestHandler nextHandler;

  public abstract void handleRequest(LeaveRequest request);
}