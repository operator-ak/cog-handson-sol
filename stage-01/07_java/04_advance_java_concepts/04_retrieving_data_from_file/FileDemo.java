import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
  public static void main(String[] args) {
    try {
      File file = new File("./log.txt");

      BufferedReader br = new BufferedReader(new FileReader(file));

      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }

    } catch (FileNotFoundException e) {
    } catch (IOException e) {
    }
  }
}