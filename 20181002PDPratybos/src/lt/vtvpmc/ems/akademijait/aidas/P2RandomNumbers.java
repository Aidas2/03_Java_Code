package lt.vtvpmc.ems.akademijait.aidas;

import java.util.Random;
// 2. Programa skirta generuoti atsitiktinius skaičius.

public class P2RandomNumbers {

    public static int generuokAtsitiktiniSkaiciu() {
        Random rand = new Random();
        int atsitiktinisSkaicius;
        atsitiktinisSkaicius = rand.nextInt(100)+1;
        System.out.println("Atsitiktinis skaicius yra: " + atsitiktinisSkaicius);
        return atsitiktinisSkaicius;
    }
}

