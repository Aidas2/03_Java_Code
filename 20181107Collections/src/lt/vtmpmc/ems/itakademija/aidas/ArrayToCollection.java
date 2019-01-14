package lt.vtmpmc.ems.itakademija.aidas;

import java.util.*;

public class ArrayToCollection {

    private static String[] groupMembers = {"Ana", "Ana", "Eivydas", "Ignas", "Vytautas", "Rugilė", "Sergej", "Virginija", "Andrius", "Aidas",
            "Aura", "Augustas", "Edvinas", "Ignas", "Ingrida", "Ivan", "Jaunius", "Jonas", "Julius", "Jurgita", "Mindaugas",
            "Paulius", "Rokas", "Giedrius", "Tomas", "Migle", "Milda"};

    public static void main(String[] args) {
        System.out.println("Array to String:      " + Arrays.toString(groupMembers));
        getLinkedList();
        getArrayList();
        getHashSet();
        getTreeSet();
        getLinkedHashSet();
        getHashMap();
        getTreeMap();
        getLinkedHashMap();
    }


    public static void getArrayList() {
        List<String> arrayList = new ArrayList<>(Arrays.asList(groupMembers));
        System.out.println("Array as List:        " + arrayList);
    }

    public static void getLinkedList() {
        List<String> linkedList = new LinkedList<>(Arrays.asList(groupMembers));
        System.out.println("Array as Linked List: " + linkedList);
    }

    public static void getHashSet() {
        Set<String> hashSet = new HashSet<>(Arrays.asList(groupMembers));
        System.out.println("Array as HashSet:     " + hashSet);
    }

    public static void getTreeSet() {
        Set<String> treeSet = new TreeSet<>(Arrays.asList(groupMembers));
        System.out.println("Array as TreeSet:     " + treeSet);
    }


    public static void getLinkedHashSet() {
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(groupMembers));
        System.out.println("Array as LinkedHashSet: " + linkedHashSet);
    }

    public static void getHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < groupMembers.length; i++) {
            hashMap.put(i, groupMembers[i]);
        }
        System.out.println("Array as HashMap:       " + hashMap);
    }

    public static void getTreeMap() {
        Map<Integer, String> treeMap = new TreeMap<>();
        for (int i = 0; i < groupMembers.length; i++) {
            treeMap.put(i, groupMembers[i]);
        }
        System.out.println("Array as TreeMap:       " + treeMap);
    }

    public static void getLinkedHashMap() {
        Map<Integer, String> linkedHashMap= new LinkedHashMap<>();
        for (int i = 0; i < groupMembers.length; i++) {
            linkedHashMap.put(i, groupMembers[i]);
        }
        System.out.println("Array as LinkedHashMap: " + linkedHashMap);
    }
}
