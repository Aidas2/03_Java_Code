import lt.vtvpmc.java.imperial.ImperialCube;
import lt.vtvpmc.java.imperial.MetricCube;

public class Adapter implements MetricCube {
    ImperialCube imperialCube; //object inside of adapter

    public Adapter(ImperialCube imperialCube){ //constructor for adapter with argument
        this.imperialCube = imperialCube;
    }

    @Override
    public double getSideInCentimeters() {
        return imperialCube.getSideInInches()*2.54;
    }

    @Override
    public double getVolumeInCentimeters() {
        return imperialCube.getVolumeInInches()*2.54*2.54*2.54;
    }

    @Override
    public String getColor() {
        return null;
    }
}


//MetricCube is interface.
// ImperialCube is NEW. MetricCube would be OLD (if would be present)
// ImperialCube should work with MetricCube interface.
// It is possible through an Adapter (which implements interfce, also stores inside object an ada[ter constructor)