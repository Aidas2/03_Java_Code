import lt.vtvpmc.Article;

public class ArticleImpl implements Article {
    private String heading; //deklaruojam parametrus
    private String brief;

    public ArticleImpl(String heading, String brief) { //sugeneruotas konstruktorius
        this.heading = heading;
        this.brief = brief;
    }

    @Override
    public String getHeading() { //geteris (ne automatinis)
        return this.heading;
    }

    @Override
    public String getBrief() { //geteris (ne automatinis)
        return this.brief;
    }
}
