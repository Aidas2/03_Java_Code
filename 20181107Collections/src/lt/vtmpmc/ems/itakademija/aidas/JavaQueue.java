package lt.vtmpmc.ems.itakademija.aidas;

//Queue

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        Personos personos1 = new Personos(1);
        Personos personos2 = new Personos(2);
        Personos personos3 = new Personos(3);
        Personos personos4 = new Personos(4);

        Queue<Personos> eilutePasGydytoja = new LinkedList<>();

        eilutePasGydytoja.add(personos2);
        eilutePasGydytoja.add(personos1);
        eilutePasGydytoja.add(personos4);
        eilutePasGydytoja.add(personos3);


        System.out.println(eilutePasGydytoja); //[Personos{id=2}, Personos{id=1}, Personos{id=4}, Personos{id=3}]
        System.out.println(eilutePasGydytoja.remove()); //Personos{id=2}    //remove pasalina pirma eileje
        System.out.println(eilutePasGydytoja);  //[Personos{id=1}, Personos{id=4}, Personos{id=3}]
        System.out.println(eilutePasGydytoja.peek()); //Personos{id=1}  //peek tik pasiziuri
        System.out.println(eilutePasGydytoja);  //[Personos{id=1}, Personos{id=4}, Personos{id=3}]
        System.out.println(eilutePasGydytoja.remove()); //Personos{id=1}
        System.out.println(eilutePasGydytoja);  //[Personos{id=4}, Personos{id=3}]
    }



}
