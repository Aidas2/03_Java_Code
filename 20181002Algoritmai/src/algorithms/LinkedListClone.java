package lt.vtvpmc.zwaclaw.collections.list.linkedlist;

import java.util.LinkedList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class LinkedListClone {
    public static void main(String a[]) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Random");
        System.out.println("Primary LinkedList:" + linkedList);
        LinkedList<String> copy = (LinkedList<String>) linkedList.clone();
        System.out.println("Cloned LinkedList:" + copy);
        copy.remove(1);
        copy.remove(2);
        System.out.println("Changed copy LinkedList:" + copy);
    }
}
