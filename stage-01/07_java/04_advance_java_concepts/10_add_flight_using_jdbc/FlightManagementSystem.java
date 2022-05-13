import java.sql.*;

public class FlightManagementSystem {
  private DB db;

  public FlightManagementSystem() {
    db = new DB();
  }

  public boolean addFlight(Flight flightObj) {
    try (Statement statement = db.getConnection().createStatement()) {
      String insertTemplate = "insert into flight values(%d, '%s', '%s', %d, %.2f)";
      int result = statement.executeUpdate(String.format(insertTemplate, flightObj.getFlightId(), flightObj.getSource(),
          flightObj.getDestination(), flightObj.getNoOfSeats(), flightObj.getFlightFare()));

      return result > 0;
    } catch (ClassNotFoundException e) {
    } catch (SQLException e) {
    }

    return false;
  }
}