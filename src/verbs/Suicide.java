package verbs;
import core.Command;
import core.PlayerConstruct;
import core.Verb;
/**
 *
 * @author Samantha
 */

//killing yourself is a feature in the actual Zork game
//if you are offended by this, feel free to delete this class
public class Suicide extends Verb {
    
    public Suicide() {
        super("suicide",
                new String[] {"kill self", "orange monkey eagle"/*I'm old and 
                        don't understand this -pedro https://youtu.be/4QQmXoR5t9I?t=55s*/,"commit suicide","stab self"},
                new boolean[] {true, false, false});
    }
    
    public void run(Command command, PlayerConstruct construct){
        if (command.getNoun().getUsageKey(15) == 2) {
            
        }
    }
}