package lt.vtvpmc.iterator;

public class FiveFinder {

    //metodas su paduodamu argumentu ?
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
