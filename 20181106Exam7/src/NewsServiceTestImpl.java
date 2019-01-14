import lt.vtvpmc.BaseNewsServiceTest;
import lt.vtvpmc.NewsService;

public class NewsServiceTestImpl extends BaseNewsServiceTest {
    @Override
    protected NewsService getNewsService() {
        return new SwearWordsFreeNewsService();
    }
}
