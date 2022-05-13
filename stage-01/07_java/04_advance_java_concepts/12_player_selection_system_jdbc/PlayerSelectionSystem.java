import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerSelectionSystem {

  public List<String> playersBasedOnHeightWeight(double minHeight, double maxWeight) {

    List<String> players = new ArrayList<>();

    try (Statement statement = DB.getConnection().createStatement()) {
      String sql = "select * from player where height >= %.1f and weight <= %.1f order by playerName";

      ResultSet resultSet = statement
          .executeQuery(String.format(sql, minHeight, maxWeight));

      while (resultSet.next()) {
        String playerName = resultSet.getString(2);
        players.add(playerName);
      }

    } catch (ClassNotFoundException e) {

    } catch (SQLException e) {
    }

    return players;
  }
}
