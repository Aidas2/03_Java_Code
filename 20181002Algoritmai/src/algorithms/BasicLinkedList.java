package lt.vtvpmc.zwaclaw.collections.list.linkedlist;

import java.util.LinkedList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class BasicLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Orange");
        linkedList.add("Apple");
        linkedList.add("Grape");
        linkedList.add("Banana");
        System.out.println(linkedList);
        System.out.println("Size of the linked list: " + linkedList.size());
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());
        System.out.println("Does LinkedList contains 'Grape'? " + linkedList.contains("Grape"));
        System.out.println("First LinkedList element: " + linkedList.getFirst());
        System.out.println("Last LinkedList element: " + linkedList.getFirst());
        System.out.println("Third LinkedList element: " + linkedList.get(2));

    }
}
