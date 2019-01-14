package lt.vtvpmc.ems;

import lt.vtvpmc.BaseNewsServiceTest;
import lt.vtvpmc.NewsService;

import lt.vtvpmc.NewsServiceImpl;

public class testing extends BaseNewsServiceTest {
    @Override
    protected NewsService getNewsService() {
        return new NewsServiceDecorator(new NewsServiceImpl());
    }
}





//        newsService.getArticles().remove();
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        List<Article> articles = (newsService.getArticles());
//
//
//
//        for(int i = articles.size() - 1; i >= 0; i--) {
//            for (int j = 0; j < SWEAR_WORDS.length; j++) {
//                if (articles.get(i).getHeading().toUpperCase().contains(SWEAR_WORDS[j].toUpperCase())) {
//                    articles.remove(i);
//                }
//            }
//        }
//
//        for(int i = articles.size() - 1; i >= 0; i--) {
//            for (int j = 0; j < SWEAR_WORDS.length; j++) {
//                if (articles.get(i).getBrief().toUpperCase().contains(SWEAR_WORDS[j].toUpperCase())) {
//                    articles.get(i).getBrief().replace(SWEAR_WORDS[j], "...");
//                    System.out.println(articles.get(i).getBrief());
//                }
//            }
//        }

//                if(articles.get(i).getBrief().toUpperCase().contains(SWEAR_WORDS[j].toUpperCase())){
//                    String s = articles.get(i).getBrief();
//
//                    s = s.replace(SWEAR_WORDS[j], "...");
//                    System.out.println(s);
//                    articles.get(i).getBrief() = s;
                    //  ArrayList <String> li = new ArrayList<String>(Arrays.asList(articles.get(i).getBrief().split(" ")));
                    //  int a = temp.toUpperCase().indexOf(SWEAR_WORDS[j].toUpperCase());


//                    }
//                }
//
//        }
//







//        while(it.hasNext()) {
//            Article a = it.next();
//            for(String s : SWEAR_WORDS) {
//                if (a.getHeading().contains(s)){
//                    System.out.println(a.getHeading());
//                    it.remove();
////                    continue;
//                }
//            }
//        }


