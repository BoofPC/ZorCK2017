import tbge.*;

/**
 * Created by lynds on 5/31/2017.
 */
public class CSRoom extends Area {

    public CSRoom(){
        super ("Comp Sci Room");
        this.getDoors().put(Direction.EAST, new Door("Hallway 5"));

        this.getInventory().add("note");

        description = "There are a lot of broken computers around the room and there is a note on the ground. " +
                "\nThere is a door to the east.";

        this.getLocalActions().put(new VerbPhrase("use", "computers"), this:: useComputers);
        this.getLocalActions().put(new VerbPhrase("take", "note"), this::takeNote);
        this.getLocalActions().put(new VerbPhrase("read", "note"), this::readNote);

    }

    public boolean useComputers(Context c){
        System.out.println("Nothing happens- did you miss that the computers are broken?!");
        if(!c.getState().contains("broken_computers_used")){
            c.getState().add("broken_computers_used");
            ((ZorCK)(c.getGame())).addPoints(10);
        }
        return !Game.GO_TO_NEXT;
    }

    public boolean takeNote(Context c){

        if(this.getInventory().remove("note")){
            System.out.println("You took the note!");
            c.getPlayer().getInventory().add("note");
            description = "There are a lot of broken computers around the room and there is a door to the east";
        } else {
            System.out.println("You already took that!");
        }

        return !Game.GO_TO_NEXT;
    }

    public boolean readNote(Context c){
        System.out.println("Why wouldn't he just grade our assignments?");
        return !Game.GO_TO_NEXT;
    }

    public boolean captureInput(VerbPhrase v, Context c){
            return Game.GO_TO_NEXT;
    }
}
