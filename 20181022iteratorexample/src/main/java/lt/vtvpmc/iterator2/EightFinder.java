package lt.vtvpmc.iterator2;

public class EightFinder {

    public boolean hasEight (IntIterator2 intIterator2) {
        while (intIterator2.hasNext()) {
            int number = intIterator2.next();

            if (number == 8) {
                return true;
            }
        }
        return false;
    }
}
