package lt.vtvpmc.zwaclaw.collections.list.arraylist;

import java.util.ArrayList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class ArrayListClone {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.add("Random");
        System.out.println("Actual ArrayList:" + arrayList);
        ArrayList<String> arrayListCopy = (ArrayList<String>) arrayList.clone();
        //Object arrayListCopy1 = arrayList.clone();
        System.out.println("Cloned ArrayList:" + arrayListCopy);
        //System.out.println("Cloned ArrayList1:" + arrayListCopy1);
        arrayListCopy.remove(2);
        System.out.println("Changed ArrayList:" + arrayListCopy);
        System.out.println("Primary ArrayList:" + arrayList);
    }
}
