import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MyNewServiceImpl implements NewsService {
    private static final String[] SWEAR_WORDS = new String[]{"rupūs miltai", "velniai rautų", "velnias", "velniais"};
    @Override
    public List<Article> getArticles() {

        List<Article> cleanArticles = new ArrayList<>();

        List<Article> articles = new NewsServiceImpl().getArticles();
        for (Article article : articles) {
            boolean clean=true;
            for (String swearWord : SWEAR_WORDS) {
                if (article.getHeading().toLowerCase().contains(swearWord.toLowerCase())) {
                    clean= false;
                    break;
                }
            }
            if (clean) {
                cleanArticles.add(article);
            }
        }

        for (Article article : cleanArticles) {
            for (String swearWord2 : SWEAR_WORDS) {
                if (article.getBrief().toLowerCase().contains(swearWord2.toLowerCase())) {
                    String replace = article.getBrief().toLowerCase().replace(swearWord2.toLowerCase(), "***");
                    System.out.println(replace);
                }
            }
        }
        return cleanArticles;
    }
}
