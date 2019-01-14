package lt.vtvpmc.iterator;

public class EvenNumberIterator implements IntIterator {
    
    private int position;


    public boolean hasNext() {
        return position < 50;
    }

    public int next() {
        int number = position * 2;
        position++;
        return number;
    }
}
