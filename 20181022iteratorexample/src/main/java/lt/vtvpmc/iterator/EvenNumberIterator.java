package lt.vtvpmc.iterator;

public class EvenNumberIterator implements IntIterator {
    
    private int position; ///deklaruojam specifine savybe (kurios nera interfeise)

    //konstruktorius - nera, nereikia ?

    public boolean hasNext() {
        return position < 50;  //rodo porinius iki 100 (o 50 yra todel kad ieskom daugindami is 2)
    }

    public int next() {
        int number = position * 2; // dauginam is 2 kad rodytu tik porinius
        position++;
        return number;
    }
}
