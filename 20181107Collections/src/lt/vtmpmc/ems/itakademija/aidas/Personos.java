package lt.vtmpmc.ems.itakademija.aidas;

//Queue

public class Personos {
    private int id;

    public Personos(int id) {   //sugeneruotas konstruktorius
        this.id = id;
    }

    @Override
    public String toString() { //sugeneruotas toString
        return "Personos{" +
                "id=" + id +
                '}';
    }
}
