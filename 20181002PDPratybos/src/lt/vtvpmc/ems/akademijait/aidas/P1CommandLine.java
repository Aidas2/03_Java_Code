package lt.vtvpmc.ems.akademijait.aidas;

import java.util.Scanner;
// 1. Programa kai kažkas kažką įveda iš komandinės eilutės.
//public class P1CommandLine {
//    public static void main (String [] args) {
//        nuskaityk();
//    }

    public class P1CommandLine {

        public static String nuskaityk() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Iveskite ka nors: ");
            String ivestas = scanner.nextLine();
            return ivestas;

        }
    }