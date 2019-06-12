/**
 * SYST 17796 Project Summer 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.*;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * 
 */
public class Game 
{
    private ArrayList<GroupOfCards> cards;
    Game()
    {
        cards = new ArrayList<GroupOfCards>();
        int index_1, index_2;
        Random generator = new Random();
        GroupOfCards temp;

       short jokerSuit=5;
       short jokerRank = 0;
           cards.add(new GroupOfCards(jokerSuit, jokerRank));
           cards.add(new GroupOfCards(jokerSuit,jokerRank));
        for (short suit=0; suit<=3; suit++)
        {
             for (short rank=0; rank<=12; rank++)
             {
                  cards.add(new GroupOfCards(suit,rank));
             }
        }//End of for-loop       
        int Size = 54;             
        for (int i=0; i<1000; i++)
        {
            index_1 = generator.nextInt( cards.size() );
            index_2 = generator.nextInt( cards.size() );
            temp = cards.get( index_2 );                    
            cards.set( index_2 , cards.get( index_1 ) );
            cards.set( index_1, temp );
        }//End of for-loop
    }//End of Game()
    public GroupOfCards drawFromGame()
    {
    /*
     * This method removes the top card of the already shuffled deck.          
     * The next step to take with this class is put the drawn card into another
     *     array that represents a players hand.  
     * This will take two arrays, and must be called depending on what player   'drawsFromGame'.
     */        
        return cards.remove( 0 );
    }//End of drawFromGame()
    public int getTotalCards()
    {
        return cards.size();   
    }//End of getTotalCards()
}//end class
