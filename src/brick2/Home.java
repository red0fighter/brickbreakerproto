/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brick2;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author sdt5106
 */
public class Home extends JPanel {

    JButton b1, b2, b3;
    
    Home() {
        super();
        setLayout(new GridLayout(3,1));
        b1 = new JButton("Play");
        b2 = new JButton("High score");
        b3 = new JButton("Exit");
        add(b1);
        add(b2);
        add(b3);
        
    }
}