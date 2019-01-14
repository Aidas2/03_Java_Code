import lt.vtvpmc.municipality.AbstractMunicipalityTest;
import lt.vtvpmc.municipality.Municipality;

public class MunicipalityTestImpl extends AbstractMunicipalityTest {
    @Override
    public Municipality getMunicipality() {
        return new MunicipalityImpl();
    }
}
