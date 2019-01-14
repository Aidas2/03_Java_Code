package it.akademija.exam.municipalityjuliuscerniauskas;

import lt.vtvpmc.municipality.AbstractMunicipalityTest;
import lt.vtvpmc.municipality.Municipality;

public class MunicipalityExamTest extends AbstractMunicipalityTest
{
    @Override
    public Municipality getMunicipality() {
        return new MunicipalityImp();
    }
}
