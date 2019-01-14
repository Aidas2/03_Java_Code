package lt.vtvpmc.ems.akademijait.aidas;

import java.util.Arrays;

public class ArraysDifferent {
    Object object;
    public static void main (String [] args) {
        System.out.println();
        randomArray(5000);          //skaicius apsprendzia masyvo ilgi
    }

    public static void randomArray(int size) {
        int [] numbers = new int [size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*1000); // skaicius apsprendzia intervala kiek bus skirtiungu reiksmiu
            //System.out.println();
        }

        System.out.println(numbers);    // atspausdina ne masyvo reiksmes, o tik pacio masyvo vieta
        System.out.println("\n");       // atspausdina tuscia eilute
        for (int i = 0; i < numbers.length; i++) {  // atspausdinam masyva panaudodami for (iteruodami)
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n");
        for (int elements : numbers) {  // atspausdinam masyva panaudodami foreach
            System.out.print(elements + " ");
        }

        System.out.println("\n");
        System.out.println(Arrays.toString(numbers)); //atspausdinam masyva paversdami ji i Stringa

        int [] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(numbersCopy);    //atspaudinam nukopijuoto masyvo vieta
        System.out.println(Arrays.toString(numbersCopy)); //atspausdinam kukopijuota masyva paversdami ji i Stringa
        int [] numberOfCows = {};

//        long startTime = System.currentTimeMillis();
//        searchMaxNumber(numbers);
//        long endTime = System.currentTimeMillis();
//        System.out.println("Vykdymo trukme 1 yra: " + (endTime - startTime) + "mS");

        long startTime = System.currentTimeMillis();
        searchMaxNumber2(numbers);
        long endTime = System.currentTimeMillis();
        System.out.println("Vykdymo trukme 2 yra: " + (endTime - startTime) + "mS");
    }

    //ieskom max reiksmes
    public static void searchMaxNumber (int [] numbers) {
        if (numbers == null) {
            System.out.println("Go home !");
        } else {
            int maxValue = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (maxValue > numbers[i]) {
                    maxValue = numbers[i];
                }
            }
            System.out.println("Max reiksme yra: " + maxValue);
        }

    }

    // surusiuojam masyva ir tada ieskom max reiksmes (paskutine eileje)
    public static void searchMaxNumber2 (int [] numbers) {
        if (numbers == null) {
            System.out.println("Go home !");
        } else {
            Arrays.sort(numbers);
            int maxValue2 = numbers[numbers.length-1];
            System.out.println("Max reiksme yra: " + maxValue2);
        }

    }
}
