package lt.vtvpmc.zwaclaw.collections.list.arraylist;

import java.util.ArrayList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        System.out.println("Actual ArrayList:" + arrayList);
        String[] stringArray = new String[arrayList.size()];
        arrayList.toArray(stringArray);
        System.out.println("Created Array content:");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}
