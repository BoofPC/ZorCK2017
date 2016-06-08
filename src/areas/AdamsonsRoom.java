package areas;

import core.*;
import items.*;

public class AdamsonsRoom extends Area {

    public AdamsonsRoom(final World containingWorld) {
        super(containingWorld);

        this.portals().north(new Portal(false, Hallway10.class))
                .west(new Portal(true,BroadcastingRoom.class));
        this.title("Adamson's Room").description("Banners hang from the ceiling proclaiming the acomplishments of Students. In the middle of the room lay 5 rows of highly advanced computers probably made by aliens. at the front of the room lie two massive movie screen sized moniters with a misterious golden key attached.").shortDescription("It's a Nerds paradise")
                .item(new Door(false, "Northern Door", null, this.portals().north()))
                .item(new Door(true, "Western Door", Key.Adamsons.class, this.portals().west()));
    }
}

