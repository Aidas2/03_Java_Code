package lt.vtvpmc.ems.itakademija.aidas;

public class GenericsMain {
    public static void main(String[] args) {
        StringBox stringBox = new StringBox(1, "Tomas");

        stringBox.getLeft();

        Box<String> box = new Box<> ("Hello", "world");
        Box<Integer> integerBox = new Box<> (1,2);
        Box<Person> personBox = new Box<> (new Person(1, "Tomas"), new Person(2, "Justina"));

        Box2<Integer, String> peopleList = new Box2<>(1, "Tomas");
        System.out.println(peopleList); //lt.vtvpmc.ems.itakademija.aidas.Box2@17ed40e0
    }

}
