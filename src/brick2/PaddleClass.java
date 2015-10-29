/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brick2;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author eqn5039
 */
public class PaddleClass {
    // create constant for the Y position of the paddle since it will only move horizontally
    public static final int Y_POS = 0;
    
    // create var for the paddle width, set constant since it shouldn't change
    public static final int PADDLE_WIDTH = 80;
    
    // create var for the paddle height, set constant
    public static final int PADDLE_HEIGHT = 10;
    
    //create var for the paddle color
    public static final Color PADDLE_COLOR = Color.black;
    
    // create var for score
    public int playerScore;
    
    // create var for name
    public String playerName;
    
    // create var for playerLives
    public int playerLives;
    
    // create var for position of paddle
    public int xPos;
    
    
    
    // getter and setter methods for playerScore, playerName, and playerLives
    public int getScore() {
        return playerScore;
    }
    
    public void setScore(int playerScore) {
        this.playerScore = playerScore;
    }
    
    
    public String getPlayerName() {
        return playerName;
    }
    
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    public int getPlayerLives() {
        return playerLives;
    }
    
    public void setPlayerLives(int playerLives) {
        this.playerLives = playerLives;
    }
    
    
    
    // draws the paddle
    public void drawPaddle(Graphics2D g) {
        
        g.setColor(PADDLE_COLOR);
        g.fillRect(xPos, Y_POS, PADDLE_WIDTH, PADDLE_HEIGHT);
        g.setColor(Color.pink);
        g.drawRect(xPos, Y_POS, PADDLE_WIDTH, PADDLE_HEIGHT);
       
    }
}
