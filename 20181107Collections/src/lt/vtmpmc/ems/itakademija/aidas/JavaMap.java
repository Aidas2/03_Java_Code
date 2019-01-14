package lt.vtmpmc.ems.itakademija.aidas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); //<Key, Value> // grazina atsitiktine tvarka
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //grazina taip kaip buvo ideti
        Map<Integer, String> treeMap = new TreeMap<>(); // moka grazinti rusiuota ir be pasikartojimu

        testMap(hashMap);       //{0=Dovile, 17=Karolis, 245=Dovydas, 39=Kitas Tomas, 7=Petras, 41=Marija}
        testMap(linkedHashMap); //{39=Kitas Tomas, 0=Dovile, 17=Karolis, 245=Dovydas, 41=Marija, 7=Petras}
        testMap(treeMap);       //{0=Dovile, 7=Petras, 17=Karolis, 39=Kitas Tomas, 41=Marija, 245=Dovydas}
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Tomas");
        map.put(0, "Dovile");
        map.put(17, "Karolis");
        map.put(245, "Dovydas");
        map.put(39, "Kitas Tomas");
        map.put(41, "Marija");
        map.put(7, "Petras");
        System.out.println(map);
    }
}
