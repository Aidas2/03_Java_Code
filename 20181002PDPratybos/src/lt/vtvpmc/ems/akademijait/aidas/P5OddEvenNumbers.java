package lt.vtvpmc.ems.akademijait.aidas;

// 5. Programa tikrinanti lyginius, nelyginius skaičius.
public class P5OddEvenNumbers {

    public static String decideOddOrEven(int skaicius) {
        if (skaicius%2 == 0 ) {
            return "Skaicius " + skaicius + " yra lyginis.";
        } else {
            return "Skaicius " + skaicius + " yra nelyginis.";
        }
    }

}

