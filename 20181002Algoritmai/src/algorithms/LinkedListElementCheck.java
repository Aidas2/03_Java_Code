package lt.vtvpmc.zwaclaw.collections.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class LinkedListElementCheck {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Random");
        List<String> list = new LinkedList<String>();
        list.add("Second");
        list.add("Random");
        System.out.println("Does LinkedList contains all list elements?: "
                + linkedList.containsAll(list));
        list.add("One");
        System.out.println("Does LinkedList contains all list elements?: "
                + linkedList.containsAll(list));
    }
}
