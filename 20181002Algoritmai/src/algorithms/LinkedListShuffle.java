package lt.vtvpmc.zwaclaw.collections.list.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class LinkedListShuffle {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
        System.out.println("Primary LinkedList: " + list);
        Collections.shuffle(list);
        System.out.println("First shuffle LinkedList: " + list);
        Collections.shuffle(list);
        System.out.println("Second shuffle LinkedList: " + list);
    }
}
