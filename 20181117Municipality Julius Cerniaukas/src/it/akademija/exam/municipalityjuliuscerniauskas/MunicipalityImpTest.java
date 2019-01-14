package it.akademija.exam.municipalityjuliuscerniauskas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @author Julius Cerniauskas
 */
public class MunicipalityImpTest {
    @Test
    public void souldBeAbleToCompareYearsCorrectly() {
        MunicipalityImp municipality = new MunicipalityImp();

        LocalDate now = LocalDate.now();
        LocalDate yesterday = now.minusDays(2);
        LocalDate tomorrow = now.plus(1, ChronoUnit.DAYS);

        Assertions.assertEquals(true, municipality.compareDate(now) > municipality.compareDate(yesterday));
        Assertions.assertEquals(false, municipality.compareDate(tomorrow) < municipality.compareDate(now));
    }

    @Test
    public void shouldBeAbleToGetAgeCorrectly() {
        MunicipalityImp municipality = new MunicipalityImp();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate birthday = LocalDate.parse("2017.01.02", formatter);
        LocalDate birthday2 = LocalDate.parse("2000.11.09", formatter);
        Assertions.assertEquals(1, municipality.getAge(birthday));
        Assertions.assertEquals(18, municipality.getAge(birthday2));
    }
}
