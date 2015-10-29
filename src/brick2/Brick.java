/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brick2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Marchetti
 */
public class Brick extends Rectangle{
    
    int x = 75;
    int y = 50;
    int width = 50;
    int height = 25;
    Color color =  new Color(0, 153, 204);
    
    
    public Brick()
    {
        super();
        
        
    }
    
    public void draw(Graphics g)
    {
        for(int x = 50; x < 950; x += 50) {
            for(y = 75; y < 450; y += 25) {
                g.setColor(color);
                g.fillRect(x, y, width, height);
                g.setColor(Color.BLACK);
                g.drawLine(x, y, x, y + height);
                g.drawLine(x, y, x + width, y);
                g.drawLine(x, y + height, x + width, y + height);
                g.drawLine(x + width, y, x + width, y + height);
            }
        }
    }
    
    public void remove()
    {
        
    }
}
