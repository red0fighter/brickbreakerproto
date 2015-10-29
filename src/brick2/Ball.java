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
 * @author sdt5106
 */
public class Ball extends Rectangle {

    int xpos = 500;
    int ypos = 500;
    String leftright;
    String updown;

    Ball() {
        super(0, 0, 20, 20);
        leftright = "left";
        updown = "up";
    }

    int getxpos() {
        return xpos;
    }

    int getypos() {
        return ypos;
    }
    
    String getleftright(){
        return leftright;
    }
    
    String getupdown(){
        return updown;
    }
    
    void setleftrirght(String a){
        leftright = a;
    }
    
    void setupdown(String a){
        updown = a;
    }
    
    void setxpos(int a) {
        xpos = a;
    }

    void setypos(int a) {
        ypos = a;
    }

    void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(xpos, ypos, 15, 15);
        g.setColor(Color.WHITE);
        g.drawOval(xpos, ypos, 15, 15);
    }
}
