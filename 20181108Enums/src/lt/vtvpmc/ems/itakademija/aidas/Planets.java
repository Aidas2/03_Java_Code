package lt.vtvpmc.ems.itakademija.aidas;

//Enumsai

public enum Planets {
    Mercury(1), Venus(2), Earth(3), Mars(4);

    private int planetNumber;

    Planets(int planetNumber) {     //sugeneruotas konstruktorius
        this.planetNumber = planetNumber;
    }

    public int getPlanetNumber() {  //sugeneruotas setteris
        return planetNumber;
    }
}
