package lt.vtvpmc.beer;

public class CubanBreweryDecorator implements Brewery {
    
    private Brewery original;
    
    public CubanBreweryDecorator(Brewery brewery) {
        this.original = brewery; //lygybes pusese objektai yra skirtingi !
    }

    @Override
    public int brewBeer(int waterInKg, int maltInKg, int hopsKg) {
        int maltTax = Math.max(1, maltInKg / 10);
        return original.brewBeer(waterInKg, maltInKg - maltTax, hopsKg);
        //return'ina pradzioje irasant original !
        //returninama reiksme eina po "original' - tai reiskia kad originalia reiksme pakeiciam
    }
}
