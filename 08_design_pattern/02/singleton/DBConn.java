public class DBConn {
  private static DBConn instance;

  private DBConn() {

  }

  public static DBConn getInstance() {
    if (instance == null) {
      instance = new DBConn();
    }

    return instance;
  }

  public void save() {
    System.out.println("Save executed");
  }
}