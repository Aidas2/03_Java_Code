package lt.vtvpmc.zwaclaw.collections.list.linkedlist;

import java.util.LinkedList;

/**
 * Created by zwaclaw on 11/8/16.
 */
public class LinkedListToArray {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Random");
        System.out.println("Actual LinkedList:"+linkedList);
        String[] stringArray = new String[linkedList.size()];
        linkedList.toArray(stringArray);
        System.out.println("Created Array content:");
        for(String str:stringArray){
            System.out.println(str);
        }
    }
}
