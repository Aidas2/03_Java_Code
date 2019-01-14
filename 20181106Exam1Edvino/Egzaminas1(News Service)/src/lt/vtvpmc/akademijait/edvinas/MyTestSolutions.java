package lt.vtvpmc.akademijait.edvinas;

import lt.vtvpmc.BaseNewsServiceTest;
import lt.vtvpmc.NewsService;


public class MyTestSolutions extends BaseNewsServiceTest {
    @Override
    protected NewsService getNewsService() {
        return new SwearWordsFreeNewsService();
    }


}
