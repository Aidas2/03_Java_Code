package lt.vtvpmc.zwaclaw.collections.list.linkedlist;

import java.util.LinkedList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class LinkedListRemoveElements {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Random");
        linkedList.add("four");
        linkedList.add("five");
        linkedList.add("six");
        linkedList.add("seven");
        linkedList.add("eight");
        linkedList.add("nine");
        System.out.println("Primary LinkedList: " + linkedList);
        System.out.println("Remov() method: " + linkedList.remove());
        System.out.println("After remove() method call: " + linkedList);
        System.out.println("Remove(index) method: " + linkedList.remove(2));
        System.out.println("After remove(index) method call: " + linkedList);
        System.out.println("Remov(object) method:" + linkedList.remove("six"));
        System.out.println("After remove(object) method call: " + linkedList);
        System.out.println("RemoveFirst() method:" + linkedList.removeFirst());
        System.out.println("After removeFirst() method call: " + linkedList);
        System.out.println("RemoveFirstOccurrence() method:"
                + linkedList.removeFirstOccurrence("eight"));
        System.out.println("After removeFirstOccurrence() method call: " + linkedList);
        System.out.println("RemoveLast() method:" + linkedList.removeLast());
        System.out.println("After removeLast() method call: " + linkedList);
        System.out.println("RemoveLastOccurrence() method: "
                + linkedList.removeLastOccurrence("five"));
        System.out.println("After removeLastOccurrence() method call: " + linkedList);
    }
}
