package lt.vtvpmc.iterator;

public class Main {
    public static void main(String[] args) {

        //sukuriam objekta pagal klase //tai va kur ta main ir psvm :) !
        EvenNumberIterator evenNumberIterator = new EvenNumberIterator();

        //objektui pritaikom metodus is klases (kol turi sekanti tol rodo sekanti)
        while (evenNumberIterator.hasNext()) {
            System.out.print(evenNumberIterator.next() + " ");
        }
    }
}
