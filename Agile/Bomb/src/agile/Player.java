/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agile;

/**
 *
 * @author Nuouolek
 */
public class Player {
    
    private int playerNumber;
    private boolean turn;
    
    public Player(){
        
    }
    
    public boolean getTurn(){
        return this.turn;
    }
    
    public void setTurn(boolean turn){
        this.turn = turn;
    }
    
    public int getPlayerNumber(){
        return this.playerNumber;
    }
    
    public void setPlayerNumber(int number){
        this.playerNumber = number;
    }
}
