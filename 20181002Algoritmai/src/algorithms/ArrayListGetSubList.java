package lt.vtvpmc.zwaclaw.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class ArrayListGetSubList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Random");
        arrayList.add("Click");
        System.out.println("Actual ArrayList:" + arrayList);
        List<String> list = arrayList.subList(2, 4);
        System.out.println("Sub List: " + list);
    }
}
