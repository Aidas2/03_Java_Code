package lt.vtvpmc.iterator2;

public class OddNumberIterator implements IntIterator2 {

    private int position;

    public boolean hasNext() {
        return position < 20;
    }

    public int next() {
        int number = position*2 + 1;
        position++;
        return number;
    }
}

