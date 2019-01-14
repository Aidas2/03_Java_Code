package lt.vtvpmc.acalc;

//Užduotis - spausdintuvo dažų sunaudojimo skaičiuoklė.
// 1. Egzistuoja spausdintuvo dažų sunaudojimo skaičiuotuvas, kuriam galima registruoti geometrines figūras.
//      Iš registruotų geometrinių figūrų, galima suskaičiuoti, kiek dažų (tonerio) reikės jas visas atspausdinti
//      (pasirinkite dažų kiekį užspalvinamam plotui, pavyzdžiui: 1 kvadratiniam milimetrui reikia 0.05 miligramo dažų).
//      Laikykime, kad figūros nepersidengia.
// 2. Programoje turėtų būti galima priregistruoti bent šias figūras:
//      2.1. Stačiakampį
//      2.2. Apskritimą
// 3. Turi būti įmanoma pridėti naujas figūras nekeičiant dažų sunaudojimo skaičiuotuvo.
// 4. Nepamirškite testų!


public abstract class Shape {

    public String name;
    public double area;
    public double quantity;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract double getArea ();

    public double getPaintQuantity () {
        return this.getArea() * 0.05;
    }

}
