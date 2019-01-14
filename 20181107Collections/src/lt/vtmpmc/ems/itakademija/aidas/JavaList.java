package lt.vtmpmc.ems.itakademija.aidas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(); // ArrayList paveldi List, todel pilnai galima nerasyt
//        arrayList.add(10);
//        arrayList.add(15);
//        arrayList.add(12);
//        arrayList.add(100);
//        arrayList.add(200);
//        arrayList.add(550);
//        //System.out.println(arrayList.get(20));  // ismeta outOfBound
//        //System.out.println(arrayList); //grazina graziai stringa
//
//        for (Integer desra: arrayList) {
//            System.out.println(desra + ", "); // atspausdinimas su ciklu foreach
//        }
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));   //atspausdinimas su ciklu for
//        }

        List<Integer> linkedList = new LinkedList<>();
        // [1] --> [2] --> [3] //Node yra einamasis mazgas

        //elementAddTime(arrayList);
        //elementAddTime(linkedList);

        //elementGetTime(arrayList);
        //elementGetTime(linkedList);

        elementDeleteTime(arrayList);
        elementDeleteTime(linkedList);

        //elementAddByIndexTime(arrayList);
        //elementAddByIndexTime(linkedList);

    }
/////////////////////////////////////
    public static void elementAddTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);    //sukuria lista su milijonu elementu
        }

        long end = System.currentTimeMillis();
        System.out.println("Add time: " + (end - start) + " ms");
    }
////////////////////////////////////
    public static void elementGetTime(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);    //sukuria lista su milijonu elementu
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.get(i);    //paima 10000 elementu
        }

        long end = System.currentTimeMillis();
        System.out.println("Get time: " + (end - start) + " ms");
    }
/////////////////////////
    public static void elementDeleteTime(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(i); //pasalina 100000 elementu
        }

        long end = System.currentTimeMillis();
        System.out.println("Remove time: " + (end - start) + " ms");
    }

///////////////////////////////////
public static void elementAddByIndexTime(List<Integer> list) {
    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
        list.add(0, i); // prideda elementus pagal indeksa
    }

    long end = System.currentTimeMillis();
    System.out.println("Add by index time: " + (end - start) + " ms");
}

}
