package lt.vtvpmc.zwaclaw.collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class LinkedListIterator {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Random");
        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
