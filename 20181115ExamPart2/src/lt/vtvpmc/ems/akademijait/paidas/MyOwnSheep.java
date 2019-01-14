package lt.vtvpmc.ems.akademijait.paidas;

import lt.vtvpmc.sheep.Sheep;
import lt.vtvpmc.sheep.SheepColor;

public class MyOwnSheep extends Sheep {
    public String name;

    public MyOwnSheep(SheepColor color, String name) {
        super(color);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
