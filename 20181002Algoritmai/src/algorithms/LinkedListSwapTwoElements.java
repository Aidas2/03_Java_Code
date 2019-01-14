package lt.vtvpmc.zwaclaw.collections.list.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class LinkedListSwapTwoElements {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
        System.out.println("Results before swap operation: " + list);
        Collections.swap(list, 2, 5);
        System.out.println("Results after swap operation: " + list);
    }
}
