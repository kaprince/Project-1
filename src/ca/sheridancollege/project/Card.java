/**
 * SYST 17796 Project Summer 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * 
 */
import java.util.*;
public class Card 
{
    public static void main(String[] args) {
        
        Game g = new Game();

        System.out.println(g.getTotalCards());
        System.out.println(g.getClass());
        int round = 1;
        new Player(g, round);       
        }//End of arguments
    }//End of class
   
