package lt.vtvpmc.iterator;

public interface IntIterator {
    boolean hasNext(); // interfeiso metodas kad patikrinti ar masyve yra sekantis elementas ar nera (zr. pastaba zemiau)
    int next();         // interfeiso metodas kad parodyti masyvo sekanti(?) elementa (zr. pastaba zemiau)
}

// kiekviena implementuojanti klase tures savus metodu algoritmus, nes kiekvienas iteratorius turi skirtinga paskirti