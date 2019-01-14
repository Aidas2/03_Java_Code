package lt.vtvpmc.iterator;

public class SingleFiveIterator implements IntIterator {

    private boolean hasReturnedFive;
    
    public boolean hasNext() {
        return !hasReturnedFive;
    }

    public int next() {
        hasReturnedFive = true;
        return 5;
    }

    
}
