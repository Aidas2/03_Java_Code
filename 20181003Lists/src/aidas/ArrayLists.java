package aidas;

import java.util.ArrayList;

public class ArrayLists {
    public static void main (String [] args) {
        ArrayList arrayLists = new ArrayList();
        //ArrayList<String> arrayLists = new ArrayList();
        String [] stringArray = {"Java", "C++"};
        arrayLists.add("Java");
        arrayLists.add("C++");
        arrayLists.add("Python");
        System.out.println("ArrayList: " + arrayLists);
        System.out.println("Stringu masyvas: " + stringArray);
    }
}
