package lt.vtvpmc.beer;

public class Main {
    public static int main(String[] args) {
        BirzuBrewery birzuBrewery = new BirzuBrewery();
        int beerBottles = birzuBrewery.brewBeer(4, 4, 4);
        System.out.println(beerBottles);
        return beerBottles;
    }
}

//DEMESIO si Main klase cia visai nereikalinga, ji sukurta kaip eksperimentas siekiant patikrinti kuo skiriasi/panasus psvm ir @Test.
//Eksperimento rezultatas: cia gi vienas ir tas pats :)
// Skirtumai/panasumai:
//a) Main klaseje rasome psvm + tab;
//   @Test rasome pv ir pavadinima ko tikimes;
//b) ir Main ir @Test sukuriame objekta pagal klase;
//c) ir Main ir @Test objektui pritaikom koki tai metoda;
//d) ir Main ir @Test laukiam rezultato:
//      - Main klaseje darom return arba sout+tab;
//       -@Test darom assertEquals (arba kita koki assert).
