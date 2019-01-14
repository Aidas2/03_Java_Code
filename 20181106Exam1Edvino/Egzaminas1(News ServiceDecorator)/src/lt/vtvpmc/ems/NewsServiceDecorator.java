package lt.vtvpmc.ems;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;

import java.util.ArrayList;
import java.util.List;

public class NewsServiceDecorator implements NewsService {
    private static final String[] SWEAR_WORDS = new String[]{"rupūs miltai", "velniai rautų", "velnias", "velniais"};
    ;

    public List<Article> articles = new ArrayList<>();

    public List<Article> articlesCensorhipped = new ArrayList<>();

    private NewsService newsService;

    public NewsServiceDecorator(NewsService newsService) {
        this.newsService = newsService;
    }

    @Override
    public List<Article> getArticles() {
        articles = newsService.getArticles();
        for (Article a : articles) {
            articlesCensorhipped.add(new ArticleDecorator(a));
        }
        for (int i = articlesCensorhipped.size() - 1; i >= 0; i--) {
            for (int j = 0; j < SWEAR_WORDS.length; j++) {
                if (articlesCensorhipped.get(i).getHeading().toUpperCase().contains(SWEAR_WORDS[j].toUpperCase())) {
                    articlesCensorhipped.remove(i);
                }
            }
        }
        return articlesCensorhipped;
    }
}
