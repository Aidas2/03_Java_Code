package lt.vtvpmc.ems.akademijait.funcional03;

import lt.vtvpmc.ems.akademijait.funcional03.DoubleEvenNumberSupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Parašyti lyginių skaičių generatorių

        Paimti 20 skaičių

        Išfiltruoti skaičius, kurie dalinasi iš 3

        Prie skaičiaus pridėti 1

        Atspausdinti skaičius formatu

        3, 5, 9, ... */

/*
  Jei norite generuoti (kaip reikia užduotyje) skaičius, tą galima padaryti įgyvendinant Supplier interface’ą(jis yra Java standartinis).
  Pavyzdžiui galite generuoti visus skaičius:
import java.util.function.Supplier;
        import java.util.stream.Stream;
*/

/*public class Main {
    public static class InfiniteNumberSupplier implements Supplier<Integer> {
        private int last;

        @Override
        public Integer get() {
            return last++;
        }
    }

    public static void main(String[] args) {
        Stream.generate(new InfiniteNumberSupplier()) // Susikuriam srautą (Stream) iš duoto tiekėjo (Supplier)
                .limit(5) // Pasiimam pirmus penkis elementus; be šios eilutės skaičius generuosime be galo
                .forEach(System.out::println); // Spausdiname visus atėjusius skaičius
    }
}

Dar gali praversti budas surinkti visus srauto elementus. Pavyzdžiui surenkame rezultatą į sąrašą.
Jei peržiūrėsite Collectors klasės dokumentaciją, rasite kolektorių kuris gali padėti su dalimi užduoties (nors yra ir kitų būdų).
    List<Integer> firstFiveNumbers = Stream.generate(new InfiniteNumberSuplier()) //Susikuriam srauta (Stream) is duoto tiekejo (Suplier)
    .limit(5) // Pasiimam pirmus penkis elementus; be sios eilutes skaicius generuosime be galo
    .collect(Collectors.toList()); //Surenkame skaicius i kolekcija.
*/

public class AppNumbers {
    public static void main(String[] args) {
        System.out.println(Stream.generate(new DoubleEvenNumberSupplier())
                .limit(20L)
                .filter(o -> o % 3 == 0)
                .map(o -> String.valueOf(o + 1))
                .collect(Collectors.joining(", ")));

        //wtf?
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        System.out.println(intList.stream().anyMatch(o -> o == 3));
    }



}

