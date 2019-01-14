import lt.vtvpmc.java.postoffice.AbstractPostOfficeTest;
import lt.vtvpmc.java.postoffice.PostOffice;

public class PostofficeTest extends AbstractPostOfficeTest {
    @Override
    protected PostOffice getPostOffice() {
        PostofficeImplementation office = new PostofficeImplementation();
        return office;
    }
}
