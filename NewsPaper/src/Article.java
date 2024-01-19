import java.util.ArrayList;
import java.util.List;

public class Article {
    String author;
    public static List<Article> article = new ArrayList<>();

    public Article(String author) {
        this.author = author;
    }
}
