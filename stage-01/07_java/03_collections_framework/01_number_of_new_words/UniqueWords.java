import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

@SuppressWarnings("unchecked") // Do not delete this line
public class UniqueWords {
  public static void main(String[] args) {

    try (Scanner in = new Scanner(System.in)) {
      System.out.println("Enter Student's Article");
      String article = in.nextLine();

      Article articleObj = new Article(article);

      System.out.println("Number of words " + articleObj.getTotalNumberOfWords());
      System.out.println("Number of unique words " + articleObj.getUniqueNoOfWords());
      articleObj.displayUniqueWords();
    }
  }

}

class Article {
  private final String article;
  private List<String> allWords;
  private Set<String> uniqueWords;

  public Article(String article) {
    this.article = article;
    extractWords();
  }

  private void extractWords() {
    StringTokenizer words = new StringTokenizer(article, " ,;:.?!");

    allWords = new ArrayList<>(words.countTokens());
    uniqueWords = new TreeSet<>();

    while (words.hasMoreTokens()) {
      String word = words.nextToken().toLowerCase();

      allWords.add(word);
      uniqueWords.add(word);
    }
  }

  public int getTotalNumberOfWords() {
    return allWords.size();
  }

  public int getUniqueNoOfWords() {
    return uniqueWords.size();
  }

  public void displayUniqueWords() {
    System.out.println("The words are");

    int count = 1;
    for (String word : uniqueWords) {
      System.out.println((count++) + ". " + word);
    }
  }
}