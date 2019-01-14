package lt.vtvpmc.zwaclaw.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class CollectionListCopyToArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Random");
        System.out.println("Primary ArrayList:" + arrayList);
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        arrayList.addAll(list);
        System.out.println("After Copy: " + arrayList);
    }
}
