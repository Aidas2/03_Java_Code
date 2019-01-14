package lt.vtvpmc.zwaclaw.collections.list.arraylist;

import java.util.ArrayList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class ClearArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Random");
        System.out.println("Primary ArrayList:" + arrayList);
        arrayList.clear();
        System.out.println("After clear ArrayList:" + arrayList);
    }
}
