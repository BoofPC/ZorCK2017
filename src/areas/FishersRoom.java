package areas;

import core.*;
import items.*;

public class FishersRoom extends Area {

    public FishersRoom(final World containingWorld) {
        super(containingWorld);
        this.getPortals().north(new Portal(Portal.State.UNLOCKED, "Hallway17"));
        this.setInitialDescription("You are in Fisher's room as various papers on "
                + "the downfall of the Ming Empire and essays as well as Silk "
                + "Roads trading changed China while a Reggae-sounding song "
                + "blares through the speakers. There is a lantern on the floor.");
        this.setDescription("This is Fisher's room, it smells vaguely of perspiration "
                + "and the Spanish Inquisition.");
        this.setDark(false);
        this.setSmell("It smells like teen spirit (or in other words perspiration)");
        this.setTaste("You taste good ol' oxygen");
        this.setSound("Blaring reggae music pounds through your ear drums");
        this.addItem(new Door(false, "Northern Door", null, this.getPortals().north()));
        this.addItem(new Lantern());
    }

    @Override
    public void interact(final Command command, final Context context) {
        Item noun;
        noun = command.getNoun();
        if(command.getVerb().getTitle().equals("look")){
            System.out.println("You see scattered papers around the room, some"
                    + " saying 'You can get it if you really want' and others"
                    + " discussing the extent to which the Kyoto Protocol assisted"
                    + " United States' environmental impacts."
                    + " Nothing seems to be of interest in this room.");
        }

        if(command.getVerb().getTitle().equals("take") && (command.getNoun().equals("paper") || command.getNoun().equals("papers"))){
            System.out.println("You feel a burning sensation as your legs and arms feel as if they"
                    + " are on fire. A faint voice in the distance yells 'Plagarism!'. You immediately"
                    + " drop the papers due to fright.");
        }

        if((command.getVerb().getTitle().equals("hello"))){
            System.out.println("Fisher says, 'Bring me some coffee.'");
        }

        if(command.getVerb().getTitle().equals("take") && command.getNoun().equals("lantern")){
            if(this.hasMatching(new Lantern())){
                System.out.println("You picked up the lantern!");
                this.removeItem(new Lantern());
            }
            else{
                System.out.println("There is no lantern in here...");
            }
        }

        else{
            if(command.getNoun() !=  null) {
                noun.interact(command,context);
            }
            if(!context.getSkipGeneral()) {
                command.getVerb().run(command, context);
            }
        }
    }


}
