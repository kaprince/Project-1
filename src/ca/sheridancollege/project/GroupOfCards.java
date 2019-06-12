/**
 * SYST 17796 Project Summer 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.*;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * 
 */
public class GroupOfCards 
{
   
     private short rank, suit;
    private static String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs", "Joker"    };
    private static String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
    private static String[] jokers = {"Joker", "Joker"};
    private static String[] ranks2 = {"0", "0"};
    public static String rankAsString( int __rank ) {
        if (__rank != 0){
            return ranks[__rank];
        }//End of if statement
        return ranks2[__rank];
    }//End of rankAsString class

    GroupOfCards(short suit, short rank)
    {
        this.rank=rank;
        this.suit=suit;    
    }//End of GroupOfCards Initializer

    public @Override String toString()
    {
        if(suit == 5){
            return "Joker";
        }//End of if statement that calls jokers
        if(rank == 0){
            return "Joker";
        }
        return ranks[rank] + " of " + suits[suit];              
    }//End of toString method
     public short getRank() {
         return rank;
    }//End of getRank method

    public short getSuit() {
        return suit;
    }//End of getSuit method
}//End of Card
    
