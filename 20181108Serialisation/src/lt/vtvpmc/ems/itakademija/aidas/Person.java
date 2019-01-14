package lt.vtvpmc.ems.itakademija.aidas;

import java.io.Serializable;

//SERIALIZACIJA

public class Person implements Serializable {
    private static final long serialVersionUID = -1684600469335426419L;
    //private static final long serialVersionUID = 6526624875553122337L; // atsiranda po pakeitimu (pvz. itraukem int age)
    //private static final long serialVersionUID = 1462268002274357523L; //sugeneravo po UID varneles
    private transient int id; //transient modifikatorius paslepia lauka rezultate
    private String name;
    private int age1;   //po pakeitimu paleidzinat ReadObjects meta Exception kad neustampa UID

    public Person(int id, String name) {    //sugeneruotas konstruktorius
        this.id = id;
        this.name = name;
    }

    public int getId() {    //sugeneruoti geteriai ir seteriai
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //overidinimas
    public String toString() {
        return id + " : " + name; //galima ir this.id, bet nebutina, perteklinis
    }



}


