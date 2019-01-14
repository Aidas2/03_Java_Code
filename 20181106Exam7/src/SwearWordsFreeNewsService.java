import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class SwearWordsFreeNewsService implements NewsService {

    //sukuriam stringu masyva, nes reikia zinoti pagal ka tikrinti (galima nukopinti is BaseNewsServiceTest)
    String[] badWords = new String[]{"rupūs miltai", "velniai rautų", "velnias", "velniais"};

    //sukuriam lista, i kuri desim tik atrinktus t.y. gerus straipsnius:
    List<Article> goodArticleList = new ArrayList<>();

    //sukuriam lista, kuriame yra visi pradiniai(originalus) straipsniai:
    List<Article> originalArticleList = new ArrayList<>();

    @Override
    public List<Article> getArticles() {
        boolean foundBadArticle = false;
        originalArticleList = NewsServiceImpl.articles;

        //iteruojam per visus straipsnius ir iteruojam per ju headingus (ieskodami ar headinge yra blogu zodziu)
        //jei randamas tai toks straipnis i nauja sarasa netraukiamas:
        for (Article currentArticle : originalArticleList) {
            for (String badWord : badWords) {
                if (currentArticle.getHeading().toLowerCase().contains(badWord.toLowerCase())) {
                    foundBadArticle = true;
                    break;
                }
            }

            //jei blogu nesurasta t.y. jei rstas straipsnios su geru heading, tada tikrinamas ar geras brief.
            // jei brief blogas pakeisti keiksmus i ***
            if(!foundBadArticle) {
                String newBrief = currentArticle.getBrief();
                for (String badWord : badWords) {
                    if (currentArticle.getBrief().contains(badWord)) {
                        newBrief = newBrief.replaceAll(badWord, "***");
                    }
                }
                goodArticleList.add(new ArticleImpl(currentArticle.getHeading(), newBrief));
            }
            foundBadArticle = false;
        }
        return goodArticleList;
    }
}
