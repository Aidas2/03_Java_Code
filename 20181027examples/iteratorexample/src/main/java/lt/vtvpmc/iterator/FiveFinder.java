package lt.vtvpmc.iterator;

public class FiveFinder {
    
    public boolean hasFive(IntIterator intIterator) {
        while (intIterator.hasNext()) {
            int number = intIterator.next();
            
            if (number == 5) {
                return true;
            }
        }
        
        return false;
    }
    
}
