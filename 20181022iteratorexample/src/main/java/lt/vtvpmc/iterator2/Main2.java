package lt.vtvpmc.iterator2;

public class Main2 {
    public static void main(String[] args) {
        OddNumberIterator oddNumberIterator = new OddNumberIterator();


        while (oddNumberIterator.hasNext()) {
            System.out.print(oddNumberIterator.next() + " ");
        }
    }
}
