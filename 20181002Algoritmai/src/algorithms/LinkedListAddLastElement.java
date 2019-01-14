package lt.vtvpmc.zwaclaw.collections.list.linkedlist;

import java.util.LinkedList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class LinkedListAddLastElement {
    public static void main(String a[]) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Random");
        System.out.println("Primary LinkedList: " + linkedList);
        System.out.println("Adding element at last position...");
        linkedList.addLast("I am last");
        System.out.println("LinkedList with added last element: " + linkedList);
    }
}
