/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verbs;
import core.Verb;
/**
 *
 * @author Alex Johnson
 */
public class Poke extends Verb{
    
    public Poke() {
        super("poke", 
                new String[]{"touch", "prod", "tap","feel"}, 
                new boolean[]{false, true, false});
    }
}
