package lt.vtmpmc.ems.itakademija.aidas;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        for (int i = 0; i < 100; i++){
            myLinkedList.add(i);
        }
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(5));
        myLinkedList.remove(5);
        System.out.println(myLinkedList);
    }
}
