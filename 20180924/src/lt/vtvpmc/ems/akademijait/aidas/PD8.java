package lt.vtvpmc.ems.akademijait.aidas;

import java.util.*;

public class PD8 {
    public static void main (String [] args) {
        //Programa turi sukurti int tipo masyvą iš 100 elementų. Masyvo
        //elementai yra užpildomi automatiškai su Random klase arba
        //random metodą iš Math klasės. Masyvas turi būti išrūšiuotas
        //nuo mažiausio iki dydžiausio elemento.

        /*Random rand = new Random();

        int[] masyvas = new int[100];
        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i] = rand.nextInt(200) + 1;
        }
        System.out.println(java.util.Arrays.toString(masyvas));

        Arrays.sort(masyvas);
        System.out.println(java.util.Arrays.toString(masyvas));*/

        //2.Programa turi paskaičiuoti Fibonačio skaičių 120 nariui. Skaiči-
        //aus nustatymas neturi viršyti 5 sek. laiko tarpo


        //3.Programa turi sukurti du vienmačius int tipo masyvus (masyvo
        //ilgis >= 20) ir surasti tų masyvų maksimalių elementų aritmetinį
        //vidurkį. Masyvai užpildomi automatiškai su Random klasė arba
        //random metodu iš Math klasės.
        Random rand = new Random();

        int[] masyvas1 = new int[25];
        int[] masyvas2 = new int[30];

        int max1 = masyvas1[0];
        int max2 = masyvas2[0];

        int vidurkis = 0;

        for (int i = 0; i < masyvas1.length; i++) {
            masyvas1[i] = rand.nextInt(200) + 1;
        }

        for (int i = 0; i < masyvas2.length; i++) {
            masyvas2[i] = rand.nextInt(200) + 1;
        }

        for (int i = 0; i < masyvas1.length; i++) {
            if (masyvas1[i] > max1) {
                max1 = masyvas1[i];
            }
        }
        System.out.println("Masyvo1 maksimalus skaicius yra: " + max1);

        for (int i = 0; i < masyvas2.length; i++) {
            if (masyvas2[i] > max1) {
                max2 = masyvas2[i];
            }
        }
        System.out.println("Masyvo2 maksimalus skaicius yra: " + max2);

        vidurkis = (max1 + max2)/2;
        System.out.println("Max skaiciu vidurkis yra: " + vidurkis);

        //4.Programa turi parodyti String tipo vienmatį masyvą (gali būti
        //vardų masyvas ir pan.) su 10 elementų. Masyvo elementai turi
        //būti išrūšiuoti pagal abėcėlę.
        List <String> masyvasStringu = new ArrayList<String>();
        masyvasStringu.add("Tomas");
        masyvasStringu.add("Saulius");
        masyvasStringu.add("Jurga");
        masyvasStringu.add("Inga");
        masyvasStringu.add("Petras");
        masyvasStringu.add("Jonas");
        masyvasStringu.add("Oksana");
        masyvasStringu.add("Toma");
        masyvasStringu.add("Ignas");
        masyvasStringu.add("Gustas");
        masyvasStringu.add("Aidas");
        System.out.println(masyvasStringu);

        Collections.sort(masyvasStringu);
        System.out.println(masyvasStringu);

        Collections.reverse(masyvasStringu);
        System.out.println(masyvasStringu);


        //5. Programa turi realizuoti long tipo masyvo greito rūšiavimo metodą.
        //Masyvo ilgis 50000 elementų.
        }
    }
