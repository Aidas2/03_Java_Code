package lt.vtvpmc.ems.akademijait.paidas;

import lt.vtvpmc.municipality.IllegalCitizenException;
import lt.vtvpmc.municipality.Municipality;
import lt.vtvpmc.municipality.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MunicipalityImplTest {

    @Test
    void registerCitizen() {
    }

    @Test
    void isRegisteredCitizen() {
    }

    @Test
    void findOldestPerson() {
    }

    @Test
    void totalIncomeInTaxes() {
    }

    @Test
    void getCitizenCount() throws IllegalCitizenException {
        MunicipalityImpl municipalityImpl = new MunicipalityImpl();
        municipalityImpl.registerCitizen(new Person("James Arthur", "Gosling", LocalDate.of(1955, 10, 01), 100000000.0));
        Assertions.assertEquals(1, municipalityImpl.getCitizenCount());
    }
}