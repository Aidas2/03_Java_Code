package imperial;

import lt.vtvpmc.java.imperial.AbstractCubeTest;
import lt.vtvpmc.java.imperial.ImperialCube;
import lt.vtvpmc.java.imperial.MetricCube;

public class AdapterTest extends AbstractCubeTest {
    @Override
    protected MetricCube adapt(ImperialCube imperialCube) {
        Converter converter = new Converter(imperialCube);
        return converter;
    }
}
