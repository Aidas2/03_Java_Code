package imperial;

import lt.vtvpmc.java.imperial.ImperialCube;
import lt.vtvpmc.java.imperial.MetricCube;

public class Converter implements MetricCube {
    private ImperialCube imperialCube; //object inside adapter

    public Converter(ImperialCube imperialCube){
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
        String color = imperialCube.getColor();
        if(color.equals("gray")){
            return "grey";
        }else{
            return color;
        }
    }
}
