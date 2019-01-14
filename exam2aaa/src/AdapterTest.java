import lt.vtvpmc.java.imperial.AbstractCubeTest;
import lt.vtvpmc.java.imperial.ImperialCube;
import lt.vtvpmc.java.imperial.MetricCube;

public class AdapterTest extends AbstractCubeTest {
    @Override
    protected MetricCube adapt(ImperialCube imperialCube) {
        Adapter adapter = new Adapter(imperialCube);
        return adapter;
    }
}
