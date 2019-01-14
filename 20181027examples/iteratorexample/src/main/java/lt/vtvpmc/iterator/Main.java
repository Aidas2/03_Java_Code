package lt.vtvpmc.iterator;

public class Main {
    public static void main(String[] args) {
        EvenNumberIterator evenNumberIterator
                = new EvenNumberIterator();
        
        while (evenNumberIterator.hasNext()) {
            System.out.println(evenNumberIterator.next());
        }
    }
}
