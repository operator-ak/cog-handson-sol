
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.sql.*;

public class TrainManagementSystem {

  public ArrayList<Train> viewTrain(String coachType, String source, String destination) {
    ArrayList<Train> trains = new ArrayList<>();

    try (Statement statement = DB.getConnection().createStatement()) {
      String sql = "select * from train where source='%s' and destination='%s' and %s order by train_number";

      ResultSet resultSet = statement
          .executeQuery(String.format(sql, source, destination, getCoachTypeForQuery(coachType.toUpperCase())));

      while (resultSet.next()) {
        Integer trainNumber = resultSet.getInt(1);
        String trainName = resultSet.getString(2);
        String trainSource = resultSet.getString(3);
        String trainDestination = resultSet.getString(4);
        Integer ac1 = resultSet.getInt(5);
        Integer ac2 = resultSet.getInt(6);
        Integer ac3 = resultSet.getInt(7);
        Integer sl = resultSet.getInt(8);
        Integer ss = resultSet.getInt(9);

        Train train = new Train(trainNumber, trainName, trainSource, trainDestination, ac1, ac2, ac3, sl, ss);

        trains.add(train);
      }

    } catch (ClassNotFoundException e) {

    } catch (SQLException e) {
    }

    return trains;

  }

  private String getCoachTypeForQuery(String coachType) {
    Map<String, String> coachTypes = new HashMap<>();

    coachTypes.put("AC1", "ac1>0");
    coachTypes.put("AC2", "ac2>0");
    coachTypes.put("AC3", "ac3>0");
    coachTypes.put("SLEEPER", "sleeper>0");
    coachTypes.put("SEATER", "seater>0");

    return coachTypes.get(coachType);
  }

}
