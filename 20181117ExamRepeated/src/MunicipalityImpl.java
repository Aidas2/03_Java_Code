import lt.vtvpmc.municipality.IllegalCitizenException;
import lt.vtvpmc.municipality.Municipality;
import lt.vtvpmc.municipality.Person;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.*;

public class MunicipalityImpl implements Municipality {
    LinkedList<Person> municipalityCitizens = new LinkedList<>();

    @Override
    public void registerCitizen(Person person) throws IllegalCitizenException {

        LocalDate currentDate = LocalDate.now();
        //System.out.println(currentDate);
        /*if (person == null) {
            throw new NullPointerException();
        }
        if (person.getFirstName() == null || person.getLastName() == null || person.getDateOfBirth() == null
        || person.getFirstName().equals("") || person.getLastName().equals("") || person.getDateOfBirth().equals("")
        || person.getYearlyIncome() < 0
        //|| currentDate.compareTo(person.getDateOfBirth()) > 0
        || person.getDateOfBirth().compareTo(currentDate) > 0)
        //|| person.getDateOfBirth().isAfter(currentDate))
        {
            throw new IllegalCitizenException(person);
        } */
        if (person.getFirstName() == null || person.getFirstName().equals("") || person.getLastName() == null || person.getLastName().equals("")
        || person.getYearlyIncome() < 0
        || person.getDateOfBirth() == null || person.getDateOfBirth().equals("")
        || person.getDateOfBirth().compareTo(currentDate) > 0
        ) {
            throw new IllegalCitizenException(person);
        }
            else if(!municipalityCitizens.contains(person)) {
            municipalityCitizens.add(person);
        }
    }

    @Override
    public boolean isRegisteredCitizen(Person person) {
        if(municipalityCitizens.contains(person)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Person findOldestPerson() {
//        Comparator<Person> oldest = Comparator.comparing(Person::getDateOfBirth);
//        return Collections.min(municipalityCitizens, oldest);
        int years = 0;
        int personYears = 0;
        Person oldestPerson = null;
     for (Person person : municipalityCitizens) {
         personYears = getAge(person.getDateOfBirth());
         if (personYears >  years) {
             years = personYears;
             oldestPerson = person;
         }
     }
        return oldestPerson;
    }

    public int getAge (LocalDate birthday) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthday, currentDate).getYears();
    }

    @Override
    public double totalIncomeInTaxes() {
        double totalIncomesPerYear = 0.00;
        for (Person person : municipalityCitizens) {
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
        int count = municipalityCitizens.size();
        return count;
    }
}
