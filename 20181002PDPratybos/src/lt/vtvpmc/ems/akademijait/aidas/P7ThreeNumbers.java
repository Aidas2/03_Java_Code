package lt.vtvpmc.ems.akademijait.aidas;

import java.util.Arrays;

// 7. Programa ieškanti didžiausio skaičiaus (pvz.: 3 skaičiai,).
public class P7ThreeNumbers {
//    public static void main (String [] args) {
//        biggestA();
//        biggestB();
//    }

    //variantas su masyvu
    public static int biggestFromArray() {
    int [] masyvas = new int [] {10, 15, 12};
        Arrays.sort(masyvas);
        System.out.println("Max value is: " + masyvas[masyvas.length-1]);
        return masyvas[masyvas.length-1];
    }

    public static int biggestFromIntegerrs() {
        int pirmas = 106;
        int antras = 155;
        int trecias = 127;
        if (pirmas > antras && pirmas > trecias) {
            System.out.println("Max value is: " + pirmas);
            return pirmas;
        } else if (antras > pirmas && antras > trecias) {
            System.out.println("Max value is: " + antras);
            return antras;
        } else {
            System.out.println("Max value is: " + trecias);
            return trecias;
        }
    }
}
