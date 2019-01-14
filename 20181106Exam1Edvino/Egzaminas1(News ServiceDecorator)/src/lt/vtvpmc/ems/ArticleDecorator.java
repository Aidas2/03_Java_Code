package lt.vtvpmc.ems;

import lt.vtvpmc.Article;

import java.util.List;

public class ArticleDecorator implements Article{
    private static final String [] SWEAR_WORDS = new String[]{"rupūs miltai", "velniai rautų", "velnias", "velniais"};

    private Article article;

    public ArticleDecorator (Article article){
        this.article = article;
    }


    @Override
    public String getHeading() {
            return article.getHeading();
    }

    @Override
    public String getBrief() {
        for (String swearWord:SWEAR_WORDS) {
            if (this.article.getBrief().contains(swearWord)) {
                return this.article.getBrief().replace(swearWord, "***");
            }
        }
        return this.article.getBrief();
    }
}
