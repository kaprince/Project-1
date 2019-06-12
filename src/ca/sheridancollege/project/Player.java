/**
 * SYST 17796 Project Summer 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * 
 */
public class Player 
{
     private GroupOfCards[] playerOneCards;
    private GroupOfCards[] playerTwoCards;
    private int[] value;
    Player(Game g, int round)
    {
        value = new int[round];
        playerOneCards = new GroupOfCards[round+2];
        playerTwoCards = new GroupOfCards[round+2];
               //(round+2) is the handsize at any given time
        for (int x=0; x<round; x++)
        {
        playerOneCards[x] = g.drawFromGame(); //fills up one hand.
        playerTwoCards[x] = g.drawFromGame(); //fills up second hand.
        }
    }
}
