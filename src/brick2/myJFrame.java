/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brick2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author sdt5106
 */
public class myJFrame extends JFrame implements ActionListener{

    Home home;

    myJFrame() {
        super();
        setLayout(new GridLayout(1,1));
        
        init();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setVisible(true);
        setResizable(false);

    }

    void init() {
        home = new Home();
        
        home.b3.addActionListener(this);
        
        add(home);
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object obj = ae.getSource();
        if (obj == home.b3)
        {
            System.exit(0);
        }
    }

}
