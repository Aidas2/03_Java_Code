package lt.vtvpmc.ems.akaddemijait.sheep;

import lt.vtvpmc.sheep.Sheep;
import lt.vtvpmc.sheep.SheepColor;

public class MySheep extends Sheep {
    String name;

    public MySheep(SheepColor color, String name) {
        super(color);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

