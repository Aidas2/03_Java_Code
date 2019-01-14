package lt.vtmpmc.ems.itakademija.aidas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaHashEqualsSetMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        map.put(1, "Tomas");
        map.put(1, "Kitas Tomas");

        set.add(15);
        set.add(15);

        System.out.println(map);    //{1=Kitas Tomas}
        System.out.println(set);    //[15]
                                    // is kur map ir set zino kad tai vienodos reiksmes ?

        System.out.println(map.hashCode()); //1531941933
        System.out.println(set.hashCode()); //15

        String name = "Karve";
        String name1 = "Karve";
        System.out.println(name.hashCode()); //72267115
        System.out.println(name1.hashCode()); //72267115 sutampa (demesio - turinio netrikrina) !
        // nors hashkodas vienodas, bet tai dar nereiskia kad ir turinys vienodas !



        //Eilutes Queue
        //FIFO - first in first in;
        //LIFO - last in first out;
        // pagal prioriteta
        //eilute su dviem kasininkem


    }


}
