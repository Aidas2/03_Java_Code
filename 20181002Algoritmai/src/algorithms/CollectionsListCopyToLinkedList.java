package lt.vtvpmc.zwaclaw.collections.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class CollectionsListCopyToLinkedList {
    public static void main(String a[]) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Random");
        System.out.println("Primary LinkedList:" + linkedList);
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        linkedList.addAll(list);
        System.out.println("After add (copy): " + linkedList);
    }
}
