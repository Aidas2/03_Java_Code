package lt.vtvpmc.akademijait.edvinas;

import lt.vtvpmc.Article;

public class ArticleImpl implements Article {
//    private Article original;
//    private String[] swearWords = new String[] {"rupūs miltai", "velniai rautų", "velnias", "velniais"};
    private String heading;
    private String brief;

    public ArticleImpl(String heading, String brief) {
//        this.original = article;
        this.heading=heading;
        this.brief=brief;
    }



    @Override
    public String getHeading() {
//        return original.getHeading();
        return this.heading;
    }

    @Override
    public String getBrief() {
//        for (String swearWord:swearWords) {
//            if (this.original.getBrief().contains(swearWord)) {
//                return this.original.getBrief().replace(swearWord, "***");
//            }
//        }
//        return this.original.getBrief();
        return this.brief;
    }

}
