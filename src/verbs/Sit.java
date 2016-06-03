package verbs;

import core.*;

public class Sit extends Verb {

    public Sit() {
        super("sit",
                new String[]{"lie down", "prone", "criss-cross applesauce"},
                Verb.usage().bare());
    }

    @Override
    public void run(final Command command, final Context construct) {


        final Player player = construct.getPlayer();
        construct.getWorld();

        player.setSit(true);
        System.out.println(player.getName() + " sat!");
    }
}
