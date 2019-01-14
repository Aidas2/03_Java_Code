package lt.vtvpmc.ems.akademijait.paidas;

import lt.vtvpmc.municipality.IllegalCitizenException;
import lt.vtvpmc.municipality.Municipality;
import lt.vtvpmc.municipality.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.*;

public class MunicipalityImpl implements Municipality {
    private  final static Logger logger = LoggerFactory.getLogger(MunicipalityImpl.class);
    private List<Person> municipalityPersons;
    public MunicipalityImpl() {
        this.municipalityPersons = new ArrayList<>();
    }

    @Override //OK
    public void registerCitizen(Person person) throws IllegalCitizenException {
        LocalDate currentDate = LocalDate.now();
        if (person == null) {
            logger.error("Trying to register a not existent person");
            throw new NullPointerException();
        }
        if (person.getFirstName() == null
                || person.getLastName() == null
                || person.getDateOfBirth() == null
                || person.getDateOfBirth().isAfter(currentDate)
                || person.getFirstName().equals("")
                || person.getLastName().equals("")
                || person.getYearlyIncome() < 0.00) {
            logger.error("Invalid parameters entered(name, surname, date of birth, yearly income)");
            throw new IllegalCitizenException(person);
        }
        if (!municipalityPersons.contains(person)) {
            municipalityPersons.add(person);
            logger.info("Person added");
        }
    }

    @Override
    public boolean isRegisteredCitizen(Person person) {
        if (person == null) {
            logger.error("Trying to check a not registered person");
            throw new NullPointerException();
        }
        if (municipalityPersons.contains(person)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Person findOldestPerson() {
        Comparator<Person> sortPersonsByAge =  Comparator.comparing(Person::getDateOfBirth); //alia funkcija
        return Collections.min(municipalityPersons, sortPersonsByAge); // paduodam masyva ir metoda pagal kuri tikrinam
    }

    @Override
    public double totalIncomeInTaxes() {
        double totalIncomesPerYear = 0.00;
        for (Person person : municipalityPersons) {
            if (person.getYearlyIncome() < 14000.00) {
                continue;
            } else if (person.getYearlyIncome() > 1000000.00) {
                totalIncomesPerYear += person.getYearlyIncome() * 0.16;
            } else if (person.getYearlyIncome() < 1000000.00) {
                totalIncomesPerYear += person.getYearlyIncome() * 0.15;
            }
        }
        return totalIncomesPerYear;
    }

    @Override
    public int getCitizenCount() {
        int count = municipalityPersons.size();
        return count;
    }
}
