package lt.vtvpmc.iterator;

public class IntArrayIterator implements IntIterator {

    private int[] ints; //deklaruojam masyva (int'u masyvas pavadinimu "ints")
    private int position; //deklaruojam kintamaji kuris atitinka/atitiks masyvo elemento indeksa
                            //pradine reiksme = 0

    //konstuktorius, kuris numato kad kuriant iteratoriu kaip argumenta reikia paduoti masyva (deklaruotas auksciau);
    public IntArrayIterator(int[] ints) {
        this.ints = ints;
    }

    //metodas pagal interfeisa (skirtas patikrinti ar yra sekantis t.y. jei masyvo ilgis yra daugiau uz indeksa tai true
    public boolean hasNext() {
        return ints.length > position;
    }

    //metodas pagal interfeisa (skirtas parodyti (ar sukurti ?) kiekviena masyvo elementa)
    public int next() {
        int result = ints[position];
        position++;
        return result;
    }
}
