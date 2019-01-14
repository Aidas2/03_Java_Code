import philatelist.Philatelist;
import philatelist.PhilatelistBaseTest;

public class PhilatelistTestImpl extends PhilatelistBaseTest {
    @Override
    protected Philatelist getPhilatelist() {
        return new PhilatelistImpl();
    }
}
