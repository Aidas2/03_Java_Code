package lt.vtvpmc.zwaclaw.collections.list.linkedlist;

import java.util.LinkedList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class ClearLinkedList {
    public static void main(String a[]) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Random");
        System.out.println("Primary LinkedList:" + linkedList);
        linkedList.clear();
        System.out.println("After clear LinkedList:" + linkedList);
    }
}
