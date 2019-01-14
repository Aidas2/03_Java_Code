package lt.vtvpmc.zwaclaw.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class ElementCheck {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Random");
        List<String> list = new ArrayList<String>();
        list.add("Second");
        list.add("Random");
        System.out.println("Does ArrayList contains all list elements?: "
                + arrayList.containsAll(list));
        list.add("One");
        System.out.println("Does ArrayList contains all list elements?: "
                + arrayList.containsAll(list));
    }
}