package lt.vtvpmc.iterator;

public class IntArrayIterator implements IntIterator {

    private int[] ints;
    private int position;

    public IntArrayIterator(int[] ints) {
        this.ints = ints;
    }

    public boolean hasNext() {
        return ints.length > position;
    }

    public int next() {
        int result = ints[position];
        position++;
        return result;
    }
}
