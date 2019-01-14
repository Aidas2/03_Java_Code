package lt.vtvpmc.iterator2;

public class IntArrayIterator2 implements IntIterator2 {

    private int[] ints;
    private int position;

    public IntArrayIterator2 (int[] ints) {
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
