package lt.vtvpmc.ems.akademijait.aidas;

import java.util.Scanner;
// 3. Programa keisti String į char ir atgal.
public class P3StringToCharAndBack {

    public static String iveskZodi() {
        System.out.println("Iveskite bet koki zodi: ");
        String zodis = (new Scanner(System.in)).nextLine();
//        System.out.println("Buvo ivestas sis zodis: " + zodis);
//        System.out.println("Pirmoji raide yra: " + returnFirstLetter(zodis));
        return zodis;
    }

    public static char returnFirstLetter(String zodis) {
        return zodis.charAt(0);
    }

    public static char[] stringToCharArray(String zodis) {
        char [] raides = zodis.toCharArray();
        for(int i = 0;  i < raides.length; i++) {
            System.out.print(raides[i] + " ");
        }
        //return charArrayToString(raides);
        return raides;
    }

    public static String charArrayToString (char [] raides) {
        String zodisVel = new String(raides);
        System.out.println("----------");
        System.out.println("Sujungtos raides: " + zodisVel);
        return zodisVel;
    }

}
