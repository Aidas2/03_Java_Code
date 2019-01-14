package lt.vtvpmc.zwaclaw.collections.list.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class LinkedListReverse {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        System.out.println("Primary LinkeList" + list);
        Collections.reverse(list);
        System.out.println("Reversed LinkedList" + list);
    }
}
