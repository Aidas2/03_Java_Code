package lt.vtvpmc.zwaclaw.collections.list.arraylist;

import java.util.ArrayList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class BasicArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("JAVA");
        arrayList.add("C++");
        arrayList.add("PHP");
        System.out.println(arrayList + "\n");
        System.out.println("Element at index 0: " + arrayList.get(0));
        System.out.println("Element at index 1: " + arrayList.get(1));
        System.out.println("Element at index 2: " + arrayList.get(2));
        System.out.println("\nDoes list contains JAVA? " + arrayList.contains("JAVA"));
        arrayList.add(2, "C#");
        System.out.println("\n" + arrayList);
        System.out.println("\nIs arraylist empty? " + arrayList.isEmpty());
        System.out.println("\nIndex of PHP is " + arrayList.indexOf("PHP"));
        System.out.println("\nSize of the arraylist is: " + arrayList.size());
    }
}
