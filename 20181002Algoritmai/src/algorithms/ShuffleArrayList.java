package lt.vtvpmc.zwaclaw.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
        System.out.println("Primary ArrayList:" + list);
        Collections.shuffle(list);
        System.out.println("Results after first shuffle operation:" + list);
        Collections.shuffle(list);
        System.out.println("Results after second shuffle operation:" + list);
    }
}
