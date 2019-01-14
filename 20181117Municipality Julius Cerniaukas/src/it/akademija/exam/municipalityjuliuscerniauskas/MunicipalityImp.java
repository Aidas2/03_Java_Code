package it.akademija.exam.municipalityjuliuscerniauskas;

import lt.vtvpmc.municipality.IllegalCitizenException;
import lt.vtvpmc.municipality.Municipality;
import lt.vtvpmc.municipality.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.LinkedList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author Julius Cerniauskas
 */
public class MunicipalityImp implements Municipality {
    private static final Logger logger = LogManager.getLogger(MunicipalityImp.class.getName());
    LinkedList<Person> persons = new LinkedList<>();

    @Override
    public void registerCitizen(Person person) throws IllegalCitizenException {
        if (person.getFirstName() == null || person.getFirstName().equals("") ||
                person.getLastName() == null ||
                person.getLastName().equals("") ||
                person.getYearlyIncome() < 0 ||
                person.getDateOfBirth() == null ||
                person.getDateOfBirth().equals("") || compareDate(person.getDateOfBirth()) > 0) {
            logger.error("Unable to add a new person: Illegal parameters");
            throw new IllegalCitizenException(person);
        } else if (!persons.contains(person)) {
            logger.info("New person has been added successful");
            persons.add(person);
        }
    }

    @Override
    public boolean isRegisteredCitizen(Person person) {
        if (persons.contains(person)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Person findOldestPerson() {
        int years = 0;
        int personYears;
        Person oldestPerson = null;
        for (Person p : persons) {
            personYears = getAge(p.getDateOfBirth());
            if (years < personYears) {
                years = personYears;
                oldestPerson = p;
            }
        }
        return oldestPerson;
    }

    @Override
    public double totalIncomeInTaxes() {
        double total = 0;
        for (Person p : persons) {
            total += getIndividualTaxes(p);
        }
        return total;
    }

    @Override
    public int getCitizenCount() {
        return persons.size();
    }

    /**
     * Compares today's date with person's birthday
     * @param date person's birthday date
     * @return if person born today returns 0, if in the pats returns positive int value,
     * if in the past returns negative int value
     */
    public int compareDate(LocalDate date) {
        LocalDate today = LocalDate.now();
        return date.compareTo(today);
    }

    /**
     * Calculates how old is person
     * @param birthDate Person's birthday
     * @return returns years as integer value
     */
    public int getAge(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        return Period.between(birthDate, today).getYears();
    }

    /**
     * Calculates Person's taxes
     * @param person Person's object
     * @return Returns calculated taxes for single person
     */
    public double getIndividualTaxes(Person person) {
        double yearlyIncome = person.getYearlyIncome();
        if (yearlyIncome < 14000.0) {
            return 0;
        } else if (yearlyIncome > 1000000.0) {
            return yearlyIncome * 0.16;
        } else {
            return yearlyIncome * 0.15;
        }
    }

}
