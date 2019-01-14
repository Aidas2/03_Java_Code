package lt.vtvpmc.iterator;

public class SingleFiveIterator implements IntIterator {

    private boolean hasReturnedFive; //deklaruojam specifine (kurios nera interfeise) savybe

    // konstruktorius - nera, nereikia ?

    //metodas pagal interfeisa
    public boolean hasNext() {
        return !hasReturnedFive;
    }

    //metodas pagal interfeisa
    public int next() {
        hasReturnedFive = true;
        return 5;
    }

    
}
