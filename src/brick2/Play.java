/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brick2;

import javax.swing.*;

/**
 *
 * @author sdt5106
 */
public class Play extends JPanel  {

    static int stageno, scoreno, livesno;

    JLabel stage, score, lives;

    Play() {
        super();

        setLayout(null);
        init();
    }

    void init() {
        stageno = 1;
        scoreno = 0;
        livesno = 3;

        stage = new JLabel("Stage #: " + stageno);
        score = new JLabel("Score: " + scoreno);
        lives = new JLabel("Lives: " + livesno);

        add(stage);
        add(score);
        add(lives);
        
        stage.setBounds(5,5, 100, 25);
        score.setBounds(115, 5, 100, 25);
        lives.setBounds(225, 5, 100, 25);
    }
    
    void updatescore(){
        scoreno += 10;
        score.setText("Score: " + scoreno);
    }

}
