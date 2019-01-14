package lt.vtvpmc.akademijait.edvinas;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

import java.util.ArrayList;

import java.util.List;

public class SwearWordsFreeNewsService implements NewsService {
    String[] badWords = {"rupūs miltai", "velniai rautų", "velnias", "velniais"};
    List<Article> goodArticleList = new ArrayList<>();
    List<Article> originalArticleList = new ArrayList<>();

    @Override
    public List<Article> getArticles() {
        boolean foundBadArticle = false;

        originalArticleList = NewsServiceImpl.articles;

        //Patikrinu antrastes ir straipsniu su keiksmazodziais Headeryje i sarasa netraukiu
        for (Article currentArticle : originalArticleList) {
            for (String badWord:badWords) {
                if (currentArticle.getHeading().toUpperCase().contains(badWord.toUpperCase())) {
                    foundBadArticle = true;
                    break;
                }
            }
            if (!foundBadArticle) {

                //kai randu straipsni su gera antraste, turiu paziureti ar tinkamas yra tekstas. Netinkama pakeisti i ***
                String newBrief = currentArticle.getBrief();

                for (String badWord:badWords) {
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


//    private List<Article> articles = new ArrayList<>();
//    private List<Article> censoredArticles = new ArrayList<>();
//    private String[] curseWords = new String[]{"rupūs miltai", "velniai rautų", "velnias", "velniais"};
//
//    @Override
//    public List<Article> getArticles() {
//        articles = NewsServiceImpl.articles;
//        boolean foundBadArticle = false;
////Check if headings contain curse word
//        for (Article a : articles) {
//            for (int i = 0; i < curseWords.length; i++) {
//                if (a.getHeading().contains(curseWords[i])) {
//                    foundBadArticle = true;
//                    break;
//
//                }
//
//
//            }
//            if (foundBadArticle == false) {
//                String newBrief = a.getBrief();
//                for (int i = 0; i < curseWords.length; i++) {
//                    if (a.getBrief().contains(curseWords[i])) {
//                        newBrief = newBrief.replaceAll(curseWords[i], "***");
//                    }
//
//                }
//                censoredArticles.add(new ArticleImpl(a.getHeading(), newBrief));
//
//            }
//            foundBadArticle = false;
//
//
//        }
//
//
////
////            censoredArticles.add(new ArticleImpl(a));
////        }
////
////
////
////        // Check the briefs as well for articles with no curse words in headings
////
////        for (Article censoredArticle: censoredArticles) {
////            for (String curseWord:curseWords) {
////                if(censoredArticle.getHeading().contains(curseWord)) {
////                    censoredArticles.remove(censoredArticle);
////                }
////            }
////        }
//
//        return censoredArticles;
//    }
//}
