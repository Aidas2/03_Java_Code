package lt.vtmpmc.ems.itakademija.aidas;

import java.util.*;

public class JavaSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();              // grazina atsitiktine tvarka
        Set<String> linkedHashSet = new LinkedHashSet<>();  //grazina taip kaip buvo ideti
        Set<String> treeSet = new TreeSet<>();              // moka grazinti rusiuota ir be pasikartojimu

        hashSet.add("Tomas");
        hashSet.add("Daina");
        hashSet.add("Daina");
        hashSet.add("Daina");
        hashSet.add("Vytas");
        hashSet.add("Egle");
        hashSet.add("Timi");
        System.out.println(hashSet); //[Daina, Timi, Tomas, Vytas, Egle]


        linkedHashSet.add("Tomas");
        linkedHashSet.add("Daina");
        linkedHashSet.add("Daina");
        linkedHashSet.add("Daina");
        linkedHashSet.add("Vytas");
        linkedHashSet.add("Egle");
        linkedHashSet.add("Timi");
        System.out.println(linkedHashSet); //[Tomas, Daina, Vytas, Egle, Timi]


        treeSet.add("Tomas");
        treeSet.add("Daina");
        treeSet.add("Daina");
        treeSet.add("Daina");
        treeSet.add("Vytas");
        treeSet.add("Egle");
        treeSet.add("Timi");
        System.out.println(treeSet); //[Daina, Egle, Timi, Tomas, Vytas]

        System.out.println(treeSet.contains("Tomas")); //true

        int [] intArray = {5,9,8,1,0,0,7,6,4}; //kaip si masyva ikelti i set'a ?

        //Set<Integer> integerSet = new TreeSet<Integer>(intArray);

    }
}
