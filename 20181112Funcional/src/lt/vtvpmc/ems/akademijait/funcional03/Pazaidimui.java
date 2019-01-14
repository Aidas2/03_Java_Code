package lt.vtvpmc.ems.akademijait.funcional03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pazaidimui {

    List<Integer> skaiciuSarasas = new ArrayList<>();

    public static void main(String[] args) {
        Pazaidimui pazaidimui = new Pazaidimui();
        pazaidimui.numbers();

        System.out.println(pazaidimui.skaiciuSarasas.toString());
    }



    public void  numbers() {
        for (int i = 0; i < 20; i++) {
            skaiciuSarasas.add(i);
            //System.out.print(i + " ");
        }
    }


}
