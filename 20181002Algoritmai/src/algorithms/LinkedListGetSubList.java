package lt.vtvpmc.zwaclaw.collections.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class LinkedListGetSubList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        //adding elements to the end
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Random");
        linkedList.add("Click");
        System.out.println("Actual LinkedList:" + linkedList);
        List<String> list = linkedList.subList(2, 4);
        System.out.println("Sub List: " + list);
    }
}
