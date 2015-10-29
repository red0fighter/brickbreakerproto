/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brick2;

import java.awt.Rectangle;

/**
 *
 * @author Marchetti
 */
public class Brick extends Rectangle{
    
    int x;
    int y;
    int width = 15;
    int height = 5;
    String color;
    
    
    public Brick()
    {
        super();
        setSize(width, height);
        
    }
    
    public void draw()
    {

    }
    
    public void remove()
    {
        
    }
}
